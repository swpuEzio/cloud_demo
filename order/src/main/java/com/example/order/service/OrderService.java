package com.example.order.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Author: xc
 * @Date: 2019/12/11 20:36
 * @Description:
 **/
@Service
public interface OrderService {
    JSONObject queryOrderByUserID(int id);
    JSONObject queryOrderByUserIDII(int id);
}
