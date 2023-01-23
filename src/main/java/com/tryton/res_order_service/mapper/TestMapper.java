package com.tryton.res_order_service.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

public interface TestMapper {

    @Insert("INSERT INTO res_order_db.consumer (name) VALUES ('test')")
    int testCall();
}
