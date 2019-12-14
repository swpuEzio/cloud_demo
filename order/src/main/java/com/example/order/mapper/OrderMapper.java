package com.example.order.mapper;

import com.example.order.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: xc
 * @Date: 2019/12/11 20:08
 * @Description:
 **/
@Mapper
@Repository
public interface OrderMapper {
    @Select("select order_table.order_id,order_table.user_id,goods.goods_id,goods.goods_name,goods.goods_desc,goods.goods_price " +
            "from order_table inner join goods on order_table.goods_id = goods.goods_id where order_table.user_id =#{id}")
    List<Map<String,String>> queryOrderByUserID(@Param("id") int id);

    @Select("select * from order_table where user_id = #{id}")
    List<Order> queryOrderByUserIDII(@Param("id") int id);
}
