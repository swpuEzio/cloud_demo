package com.example.order.model;

import lombok.Data;

/**
 * @Author: xc
 * @Date: 2019/12/11 19:54
 * @Description:
 **/
@Data
public class Order {
    private int order_id;
    private int user_id;
    private int goods_id;
}
