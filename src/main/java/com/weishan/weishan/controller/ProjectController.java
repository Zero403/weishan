package com.weishan.weishan.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.weishan.weishan.common.util.ResultUtil;
import com.weishan.weishan.common.vo.ResultVO;
import com.weishan.weishan.entity.Project;
import com.weishan.weishan.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kilo
 * @since 2019-05-04
 */
@RestController
@RequestMapping("/weishan.weishan/project")
@Api(value = "活动相关",tags = "活动")
public class ProjectController{
        @Autowired
        private ProjectService projectService;

        @PostMapping("/list.do")
        @ApiOperation(notes = "展示所有",value = "展示所有")
        public ResultVO list(@RequestParam("page") @ApiParam(name = "page",value = "页码") int page, @RequestParam("limit") @ApiParam(name = "limit",value = "每页条数")int limit){
            IPage<Project> iPage = projectService.page(new Page<>(page, limit));
            return ResultUtil.exec(iPage.getTotal() > 0 , "",iPage);
        }
}
