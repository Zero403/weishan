package com.weishan.weishan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.weishan.weishan.entity.Donate;
import com.weishan.weishan.entity.DonateVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
public interface DonateService extends IService<Donate> {
    List<DonateVO> getByPid(int pid, IPage<DonateVO> page);
}
