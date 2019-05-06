package com.weishan.weishan.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weishan.weishan.common.vo.DonateVO;
import com.weishan.weishan.entity.Donate;
import com.weishan.weishan.dao.DonateMapper;
import com.weishan.weishan.service.DonateService;
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
public class DonateServiceImpl extends ServiceImpl<DonateMapper, Donate> implements DonateService {

    @Override
    public List<DonateVO> getByPid(int pid, IPage<DonateVO> page) {
        return baseMapper.select(pid,page);
    }
}
