package com.tryton.res_order_service.mapper;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {

    @Select("select 1 from `auth`.role limit 1")
    int testCall();
}
