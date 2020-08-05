package com.zking.service;

import com.zking.model.Order;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrderMapperService {


    @Transactional
    Order Many_To_One(Order order);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}