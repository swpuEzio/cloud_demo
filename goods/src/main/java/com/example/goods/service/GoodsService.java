package com.example.goods.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Author: xc
 * @Date: 2019/12/9 21:59
 * @Description:
 **/
@Service
public interface GoodsService {
    JSONObject findGoodsByID(int id);
}
