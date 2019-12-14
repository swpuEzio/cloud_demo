package com.example.goods.util;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: xc
 * @Date: 2019/12/11 13:31
 * @Description: 对json抽象
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class JsonUtil<T> {
    protected String code;
    protected String msg;
    protected T data;
    public abstract JSONObject success(T data);
    public abstract JSONObject fail(String msg);
    public abstract JSONObject fail();
}
