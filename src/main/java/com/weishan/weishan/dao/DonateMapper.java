package com.weishan.weishan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.weishan.weishan.common.vo.DonateVO;
import com.weishan.weishan.entity.Donate;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
public interface DonateMapper extends BaseMapper<Donate> {
    @Select("select d.*,v.vrealname from donate d inner join volunteer v on  d.uid=v.uid where d.pid=#{pid}")
    List<DonateVO> select(int pid, IPage<DonateVO> page);

    @Select("SELECT sum(dmoney) from donate where pid=#{pid}")
    Integer findMoney(Integer pid);
}