package com.weishan.weishan.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weishan.weishan.common.vo.DynamicVO;
import com.weishan.weishan.dao.DynamicMapper;
import com.weishan.weishan.entity.Dynamic;
import com.weishan.weishan.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@Service
public class DynamicServiceImpl extends ServiceImpl<DynamicMapper, Dynamic> implements DynamicService {

    @Autowired
    private DynamicMapper dynamicDao;

    @Override
    public List<DynamicVO> listAll(IPage<DynamicVO> page) {
        return dynamicDao.findAll(page);
    }

    @Override
    public int updateThumb(int id) {
        return dynamicDao.updateThumb(id);
    }

    @Override
    public int cancelThumb(int id) {
        return dynamicDao.cancelThumb(id);
    }

    @Override
    public Dynamic findByDid(int did) {
        return dynamicDao.findByDid(did);
    }
}
