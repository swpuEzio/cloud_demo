package com.example.goods.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.goods.mapper.GoodsMapper;
import com.example.goods.model.Goods;
import com.example.goods.service.GoodsService;
import com.example.goods.util.GoodsJsonResult;
import com.example.goods.util.JsonContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xc
 * @Date: 2019/12/9 22:01
 * @Description:
 **/
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public JSONObject findGoodsByID(int id) {
        System.out.println(id);
       Goods good = goodsMapper.findGoodsByID(id);
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(good);
        System.out.println(jsonObject);
        return jsonObject;
    }
}
