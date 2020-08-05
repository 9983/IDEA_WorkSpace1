package com.zking.mapper;

import com.zking.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    Order Many_To_One(Order order);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}