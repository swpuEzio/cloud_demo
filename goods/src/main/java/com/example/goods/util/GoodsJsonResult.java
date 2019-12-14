package com.example.goods.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: xc
 * @Date: 2019/12/11 18:50
 * @Description: Goods的json结果封装类
 **/
public class GoodsJsonResult extends ListJsonUtil {
    @Override
    public JSONObject success(Object data) {
        return super.success(data);
    }

    @Override
    public JSONObject fail(String msg) {
        return super.fail(msg);
    }

    @Override
    public JSONObject fail() {
        return super.fail();
    }
}
