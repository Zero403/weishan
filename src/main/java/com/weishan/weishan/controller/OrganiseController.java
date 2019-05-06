package com.weishan.weishan.controller;

import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.service.OrganiseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@Controller
@RequestMapping("/weishan.weishan/organise")
@Api(value = "组织相关",tags = "组织")
public class OrganiseController {
	@Autowired
    private OrganiseService organiseService;
	@GetMapping("one.do")
    public ResultVO one(int oid){
	    return ResultUtil.exec(organiseService.getById(oid) != null,"查找",organiseService.getById(oid));
    }
}
