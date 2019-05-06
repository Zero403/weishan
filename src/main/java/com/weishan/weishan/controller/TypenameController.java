package com.weishan.weishan.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.DonateVO;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.service.DonateService;
import com.weishan.weishan.service.TypenameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@RestController
@RequestMapping("/weishan.weishan/type")
@Api(value = "类型", tags = "活动类型")
public class TypenameController {
	@Autowired
    private TypenameService typenameService;

//	@PostMapping("/add.do")
//    public ResultVO add(@RequestBody Donate donate, HttpServletRequest request){
//	    request.get
//	    donate.setUid();
//    }
    @GetMapping("/list.do")
    @ApiOperation(value = "类型", notes = "查询所有类型")
    public ResultVO list(){
        return ResultUtil.exec(typenameService.list().size() > 0,"查询活动类型",typenameService.list());
    }
}
