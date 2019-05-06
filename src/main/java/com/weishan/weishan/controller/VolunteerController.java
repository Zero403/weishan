package com.weishan.weishan.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.entity.Volunteer;
import com.weishan.weishan.service.VolunteerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/weishan.weishan/volunteer")
@Api(value = "志愿者相关",tags = "志愿者")
public class VolunteerController {
	@Autowired
    private VolunteerService volunteerService;

	@PostMapping("/add")
    @ApiOperation(notes = "添加到特定活动,需要uid支持", value = "添加")
    public ResultVO add(@ApiParam(value = "志愿者信息，id不填，此处uid不填")@RequestBody Volunteer volunteer, @ApiParam(value = "用户id")@RequestParam("uid") Integer uid) {
        volunteer.setUid(uid);
        return volunteerService.save(volunteer)?ResultUtil.setOK("添加成功"):ResultUtil.setERROR("添加失败");
    }

    @PostMapping("/find")
    @ApiOperation(notes = "查询指定活动志愿者,查询总数也使用此接口，未查询到也会返回1001", value = "查询组织内")
    public ResultVO find(@ApiParam(value = "项目id",name = "pid")@RequestParam Integer pid,@RequestParam("page") Integer page,@RequestParam("limit")Integer limit) {
        IPage<Volunteer> iPage = volunteerService.page(new Page<Volunteer>(page, limit), new QueryWrapper<Volunteer>().eq("pid", pid));
        return ResultUtil.exec(iPage.getRecords().size() > 0,"查询",iPage);
    }

    @PostMapping("/findAll")
    @ApiOperation(notes = "查询所有志愿者,查询总数也使用此接口，未查询到也会返回1001", value = "查询所有")
    public ResultVO findAll(@RequestParam("page") Integer page,@RequestParam("limit")Integer limit) {
        IPage<Volunteer> page1 = volunteerService.page(new Page<>(page, limit));
        return ResultUtil.exec(page1.getRecords().size() > 0,"查询",page1);
    }
}

