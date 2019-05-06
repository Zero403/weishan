package com.weishan.weishan.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.DonateVO;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.entity.Donate;
import com.weishan.weishan.service.DonateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@RestController
@RequestMapping("/weishan.weishan/donate")
@Api(value = "捐赠", tags = "捐赠相关")
public class DonateController {
	@Autowired
    private DonateService donateService;

//	@PostMapping("/add.do")
//    public ResultVO add(@RequestBody Donate donate, HttpServletRequest request){
//	    request.get
//	    donate.setUid();
//    }
    @PostMapping("/list.do")
    public ResultVO list(@RequestParam("pid") @ApiParam(value = "活动id",name = "pid") int pid,@RequestParam("page") @ApiParam(name = "page",value = "页码") int page, @RequestParam("limit") @ApiParam(name = "limit",value = "每页条数")int limit){
        Page<DonateVO> page1 = new Page<>(page, limit);
        page1.setRecords(donateService.getByPid(pid, page1));
        return ResultUtil.exec(page1.getTotal() > 0,"捐赠",page1);
    }
}
