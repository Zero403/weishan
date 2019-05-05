package com.weishan.weishan.controller;

import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.entity.Volunteer;
import com.weishan.weishan.service.VolunteerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/weishan.weishan/volunteer")
@Api(value = "志愿者相关",tags = "志愿者")
public class VolunteerController {
	@Autowired
    private VolunteerService volunteerService;

	@PostMapping("/add")
    @ApiOperation(notes = "添加到特定活动", value = "添加")
    public ResultVO add(@RequestBody Volunteer volunteer, HttpServletRequest request) {
        int uid = Integer.parseInt(request.getParameter("uid"));
        volunteer.setUid(uid);
        return volunteerService.save(volunteer)?ResultUtil.setOK("添加成功"):ResultUtil.setERROR("添加失败");
    }
}

