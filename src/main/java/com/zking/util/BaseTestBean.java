package com.zking.util;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*测试公共类*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BaseTestBean {

    protected PageBean pageBean;

    @Before
    public void setUp() throws Exception {

        pageBean = new PageBean();

    }


}
