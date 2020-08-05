package com.zking.service.impl;

import com.zking.mapper.OrderMapper;
import com.zking.model.Order;
import com.zking.service.IOrderMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMapperServiceImpl implements IOrderMapperService {

    @Autowired
    private OrderMapper om;

    @Override
    public Order Many_To_One(Order order) {
        return om.Many_To_One(order);
    }

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return 0;
    }

    @Override
    public int insert(Order record) {
        return 0;
    }

    @Override
    public int insertSelective(Order record) {
        return 0;
    }

    @Override
    public Order selectByPrimaryKey(Integer orderId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return 0;
    }
}
