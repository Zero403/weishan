package com.weishan.weishan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.weishan.weishan.common.vo.DynamicVO;
import com.weishan.weishan.entity.Dynamic;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
public interface DynamicService extends IService<Dynamic> {
    List<DynamicVO> listAll(IPage<DynamicVO> page);

    int updateThumb(int id);

    int cancelThumb(int id);

    Dynamic findByDid(int did);

}
