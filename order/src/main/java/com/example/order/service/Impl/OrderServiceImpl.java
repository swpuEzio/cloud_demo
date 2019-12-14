package com.example.order.service.Impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.order.mapper.OrderMapper;
import com.example.order.model.Goods;
import com.example.order.model.Order;
import com.example.order.service.OrderService;
import com.example.order.util.JsonContext;
import com.example.order.util.JsonUtilImpl;
import com.example.order.util.OrderJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @Author: xc
 * @Date: 2019/12/11 20:39
 * @Description:
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public JSONObject queryOrderByUserID(int id) {
        List<Map<String,String>> orders = orderMapper.queryOrderByUserID(id);
        JsonContext< List<Map<String,String>>> jc = new JsonContext<>(new OrderJsonResult<>());
        JSONObject jsonObject = jc.success(orders);
        System.out.println(jsonObject);
        return jsonObject;
    }

    /**
     * 模拟需要调用查询商品信息
     * @param id
     * @return
     */
    @Autowired
    RestTemplate restTemplate;

    @Override
    public JSONObject queryOrderByUserIDII(int id) {
        List<Order> orders = orderMapper.queryOrderByUserIDII(id);
        JSONArray goods = new JSONArray();
        for (Order order:orders){
            /**
             * 使用DiscoveryClient获取服务实体，然后使用服务实体的第一个去做网络请求

            String service = "goods-service";
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            if (instances.isEmpty()){
                return null;
            }
            String url = "http://" + instances.get(0).getHost()+":"+instances.get(0).getPort() + "/goods/" + order.getGoods_id();


             */
            /**
             * 有多台服务器用ribbon做负载均衡
             */
            String service = "goods-service";
            String url = "http://" + service + "/goods/" + order.getGoods_id();
            Goods good =restTemplate.getForObject(url,Goods.class);
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(good);
            goods.add(jsonObject);
        }
        JSONObject returnJsono = new JSONObject();
        returnJsono.put("code",200);
        returnJsono.put("msg","success");
        returnJsono.put("data",goods);
        return returnJsono;
    }
}
