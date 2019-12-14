package com.example.order.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: xc
 * @Date: 2019/12/11 20:42
 * @Description:
 **/
public class OrderJsonResult<T> extends ListJsonUtil<T> {
    @Override
    public JSONObject success(T data) {
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
