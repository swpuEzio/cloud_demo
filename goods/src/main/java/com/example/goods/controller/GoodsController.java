package com.example.goods.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xc
 * @Date: 2019/12/11 19:03
 * @Description:
 **/
@RestController
@RequestMapping(value = "/goods" ,produces ="application/json;charset=UTF-8")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @GetMapping("/{id}")
    public JSONObject get(@PathVariable("id") int id){
        System.out.println("3号收到请求");
        return goodsService.findGoodsByID(id);
    }
}
