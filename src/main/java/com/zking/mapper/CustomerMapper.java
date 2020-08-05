package com.zking.mapper;

import com.zking.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {

    Customer SelectForOne_to_many(Customer Customer);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}