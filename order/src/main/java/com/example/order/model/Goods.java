package com.example.order.model;

import lombok.Data;

/**
 * @Author: xc
 * @Date: 2019/12/9 21:40
 * @Description:
 **/
@Data
public class Goods {
    private int goods_id;
    private String goods_name;
    private String goods_desc;
    private float goods_price;
}
