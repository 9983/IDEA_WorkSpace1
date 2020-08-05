package com.zking.service;

import com.zking.model.Customer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerMapperService {

    @Transactional
    Customer SelectForOne_to_many(Customer Customer);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}