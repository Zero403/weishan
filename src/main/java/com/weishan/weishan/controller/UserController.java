package com.weishan.weishan.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.weishan.weishan.common.util.AliyunSmsUtil;
import com.weishan.weishan.common.util.CheckPhone;
import com.weishan.weishan.common.util.JedisUtil;
import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.entity.User;
import com.weishan.weishan.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@RestController
@RequestMapping("/weishan.weishan/user")
@Api(value = "用户相关", tags = "用户相关")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/authCode.do")
    @ApiOperation(value = "发送验证码", notes = "发送验证码 请求手机号 前端最好验证下格式 验证码15分钟内有效 type注册给1 找回密码给2")
    public ResultVO authCode(String phone, Integer type){
        boolean isPhone = CheckPhone.isMobileNO(phone);
        if (!isPhone){return ResultUtil.setERROR("手机号格式错误");
        }

        if (2 != type){
            User user = userService.getOne(new QueryWrapper<User>().eq("phone", phone));
            if (null != user){
                return ResultUtil.setERROR("该手机号码已经注册 忘记密码请去重置密码");
            }
        }

        Random random = new Random();
        int authcode = random.nextInt(900000) + 100000;
        new JedisUtil().setStr(phone, authcode + "", 900);
        boolean sendSms = AliyunSmsUtil.sendSms(phone, authcode);

        return ResultUtil.exec(sendSms, sendSms ? "验证码发送成功" : "验证码发送失败", null);
    }

    @PostMapping("/register.do")
    @ApiOperation(value = "注册", notes = "注册完直接登录的话返回会有个用户id 要uid的时候发这个id就行了")
    public ResultVO register(String phone, String password, String authcode, Integer type){
        String authcodeR = new JedisUtil().getStr(phone);
        if (!authcode.equals(authcodeR)){
            return ResultUtil.setERROR("验证码错误或已过期");
        }
        User user = new User();
        user.setPhone(phone);
        user.setPassword(password);
        user.setUsername("会员" + phone.toString().substring(0, 3) + "****" + phone.substring(7));
        boolean flag = userService.save(user);
        return ResultUtil.exec(flag, flag ? "注册成功" : "注册失败", flag ? userService.getOne(new QueryWrapper<User>().eq("phone", phone)).getId() : null);
    }

    @PostMapping("/login.do")
    @ApiOperation(value = "登录", notes = "登录成功后会返回一个用户id要uid的时候返回这个id")
    public ResultVO login(String phone, String password){
        User user = userService.getOne(new QueryWrapper<User>().eq("phone", phone));
        boolean flag = true;
        try {
            flag = user.getPassword().equals(password);
        }catch (Exception e){
            flag = false;
        }

        return ResultUtil.exec(flag, flag ? "登录成功" : "用户名或密码错误", flag ? user.getId() : null);
    }
}
