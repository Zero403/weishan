package com.weishan.weishan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.weishan.weishan.common.vo.DynamicVO;
import com.weishan.weishan.entity.Dynamic;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
public interface DynamicMapper extends BaseMapper<Dynamic> {

    @Select("SELECT d.*,u.username uname,u.headimg,p.location FROM dynamic d\n" +
            " LEFT JOIN user u\n" +
            "on u.id = d.uid\n" +
            "LEFT JOIN project p\n" +
            "on d.pid=p.pid")
    List<DynamicVO> findAll(IPage<DynamicVO> page);

    @Update("UPDATE dynamic SET thumb = thumb +1 where id = #{id}")
    int updateThumb(int id);

    @Update("UPDATE dynamic SET thumb = thumb -1 where id = #{id}")
    int cancelThumb(int id);


    @Select("SELECT * FROM dynamic where id = #{id}")
    Dynamic findByDid(int id);

}