package com.weishan.weishan.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.DynamicVO;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.entity.Dynamic;
import com.weishan.weishan.service.DynamicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("/weishan.weishan/dynamic")
@Api(value = "动态", tags = "动态相关")
public class DynamicController {
	@Autowired
    private DynamicService dynamicService;

//	@PostMapping("/add.do")
//    public ResultVO add(@RequestBody Donate donate, HttpServletRequest request){
//	    request.get
//	    donate.setUid();
//    }
    @PostMapping("/list.do")
    @ApiOperation(notes = "动态宣传页面",value = "展示所有宣传")
    public ResultVO list(@ApiParam(name = "page",value = "页码") Integer page, @ApiParam(name = "limit",value = "每页条数")Integer limit){
        page = page == null?1:page;
        limit = limit == null?20:limit;
        Page<DynamicVO> page1 = new Page<>(page, limit);
        page1.setRecords(dynamicService.listAll(page1));
        return ResultUtil.exec(page1.getTotal() > 0,"",page1);
    }

    @PostMapping("/thumb.do")
    @ApiOperation(notes = "动态宣传页面",value = "对动态点赞")
    public ResultVO thumb(@RequestParam("did") @ApiParam(name = "did",value = "动态id") int did){
        int i = dynamicService.updateThumb(did);
        return ResultUtil.exec(i > 0,"点赞成功",i);
    }

    @PostMapping("/cancelthumb.do")
    @ApiOperation(notes = "动态宣传页面",value = "对动态取消点赞")
    public ResultVO cancelThumb(@RequestParam("did") @ApiParam(name = "did",value = "动态id") int did){
        int i = dynamicService.cancelThumb(did);
        return ResultUtil.exec(i > 0,"取消点赞成功",i);
    }


    @PostMapping("/transmit.do")
    @ApiOperation(notes = "动态宣传页面",value = "对动态转发")
    public ResultVO transmit(@RequestParam("did") @ApiParam(name = "did",value = "动态id") int did,@RequestParam("uid") @ApiParam(name = "uid",value = "转发人id")int uid){
        Dynamic dynamic = dynamicService.findByDid(did);
        dynamic.setUid(uid);
        dynamic.setTransmit(dynamic.getTransmit()+1);

        dynamic.setThumb(0);
        dynamic.setTransmit(0);
        dynamic.setComment(0);
        dynamic.setCreatetime(new Date());
        boolean b = dynamicService.save(dynamic);
        return ResultUtil.exec(b,"","转发成功");
    }
}
