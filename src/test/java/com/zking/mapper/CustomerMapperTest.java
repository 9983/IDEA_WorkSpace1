package com.zking.mapper;

import com.zking.model.Customer;
import com.zking.service.ICustomerMapperService;
import com.zking.util.BaseTestBean;
import com.zking.util.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CustomerMapperTest extends BaseTestBean {

    @Autowired
    private ICustomerMapperService cms;
    private Customer customer;

    @Before
    public void setUp() throws Exception {

        super.setUp();
        customer = new Customer();
    }

    @Test
    public void selectForOne_to_many() {

        pageBean.setRows(3);
        customer.setCustomerId(1);

        Customer c = cms.SelectForOne_to_many(customer);

        System.out.println(c);

    }
}