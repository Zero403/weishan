package com.weishan.weishan.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.entity.Signin;
import com.weishan.weishan.service.SigninService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@RestController
@RequestMapping("/weishan.weishan/signin")
@Api(value = "签到", tags = "签到相关")
public class SigninController {
	@Autowired
    private SigninService signinService;

	@GetMapping("/signin.do")
    @ApiOperation(value = "签到", notes = "签到")
	public ResultVO signIn(Integer uid, String location){
        Signin signinOne = null;
        try {
            signinOne = signinService.list(new QueryWrapper<Signin>().eq("uid", uid).orderByDesc("date")).get(0);
        }catch (Exception e){

        }
        if(signinOne != null){
            if (signinOne.getDate().getTime() + (8 * 3600000) == new Date().getTime() /(24 * 3600000)*(24 * 3600000) ){
                return ResultUtil.setERROR("每天只能签到一次");
            }
        }
        Signin signin = new Signin();
        signin.setDate(new Date(new Date().getTime() /(24 * 3600000)*(24 * 3600000)));
        signin.setUid(uid);
        signin.setLocation(location);
        boolean flag = signinService.save(signin);
        return ResultUtil.exec(flag, flag ? "签到成功" : "签到失败", null);
    }
}
