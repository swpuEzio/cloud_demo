package com.example.order.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: xc
 * @Date: 2019/12/11 18:52
 * @Description: json工厂
 **/
public class JsonContext<T> {
    /**
     * 一般都是具体的子类
     */
    private JsonUtil<T> jsonUtil;

    public JsonContext(JsonUtil<T> jsonUtil) {
        this.jsonUtil = jsonUtil;
    }
    public JSONObject success(T data){
        return jsonUtil.success(data);
    }
    public JSONObject fail(String msg){
        return jsonUtil.fail(msg);
    }
    public JSONObject fail(){
        return jsonUtil.fail();
    }
}
