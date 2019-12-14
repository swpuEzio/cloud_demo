package com.example.order.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xc
 * @Date: 2019/12/11 20:46
 * @Description:
 **/
@RestController
@RequestMapping(value = "/order" ,produces ="application/json;charset=UTF-8")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/{id}")
    public JSONObject query(@PathVariable("id") int id){
        return orderService.queryOrderByUserID(id);
    }
    @GetMapping("/query/{id}")
    public JSONObject queryII(@PathVariable("id") int id){
        return orderService.queryOrderByUserIDII(id);
    }
}
