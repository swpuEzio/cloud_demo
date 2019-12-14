package com.example.goods.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: xc
 * @Date: 2019/12/11 13:45
 * @Description: jsonUtil实现
 **/
public class JsonUtilImpl<T> extends JsonUtil<T>{
    @Override
    public JSONObject success(T data) {
        code = "200";
        msg = "success";
        this.data = data;
        JSONObject json = (JSONObject) JSONObject.toJSON(this);
        return json;
    }

    @Override
    public JSONObject fail(String msg) {
       code = "500";
       this.msg = msg;
        JSONObject json = (JSONObject) JSONObject.toJSON(this);
        return json;
    }

    @Override
    public JSONObject fail() {
        code = "500";
        this.msg = "fail";
        JSONObject json = (JSONObject) JSONObject.toJSON(this);
        return json;
    }
}
