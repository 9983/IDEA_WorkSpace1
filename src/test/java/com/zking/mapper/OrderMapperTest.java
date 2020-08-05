package com.zking.mapper;

import com.zking.model.Order;
import com.zking.service.IOrderMapperService;
import com.zking.util.BaseTestBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderMapperTest extends BaseTestBean {

    @Autowired
    private IOrderMapperService oms;
    private Order order;


    @Before
    public void before() throws Exception{

        order = new Order();
        super.setUp();
    }

    @Test
    public void many_To_One() {

        pageBean.setRows(10);
        order.setOrderId(6);

        Order order = oms.Many_To_One(this.order);
        System.out.println(order);


    }
}