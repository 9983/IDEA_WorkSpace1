package com.zking.service.impl;

import com.zking.mapper.CustomerMapper;
import com.zking.model.Customer;
import com.zking.service.ICustomerMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICustomerMapperServiceImpl implements ICustomerMapperService {

    @Autowired
    private CustomerMapper ctm;


    @Override
    public Customer SelectForOne_to_many(Customer Customer) {
        return ctm.SelectForOne_to_many(Customer);
    }

    @Override
    public int insert(Customer record) {
        return 0;
    }

    @Override
    public int insertSelective(Customer record) {
        return 0;
    }

    @Override
    public Customer selectByPrimaryKey(Integer customerId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return 0;
    }
}
