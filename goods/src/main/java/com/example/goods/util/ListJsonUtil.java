package com.example.goods.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author: xc
 * @Date: 2019/12/11 14:03
 * @Description: 集合类的json封装
 **/
public class ListJsonUtil<T>  extends JsonUtilImpl<T>{
    @Override
    public JSONObject success(T data) {
        if(data == null){
            return super.success(null);
        }
        Class<?> currentClass = data.getClass();
        if ("List".equals(currentClass.getSimpleName())){
            code = "200";
            msg = "success";
            this.data =(T)JSONArray.toJSON(data);
            JSONObject  jsonObject = (JSONObject) JSONObject.toJSON(this);
            return jsonObject;
        }else {
            return super.success(data);
        }
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
