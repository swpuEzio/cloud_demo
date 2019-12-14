package com.example.goods.mapper;

import com.example.goods.model.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: xc
 * @Date: 2019/12/9 21:43
 * @Description:
 **/
@Mapper
@Repository
public interface GoodsMapper {
    @Select("select * from goods where goods_id = #{id}")
    Goods findGoodsByID(@Param("id") int id);
}
