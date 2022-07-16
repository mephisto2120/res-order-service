package com.tryton.res_order_service.mapper;


import com.tryton.res_order_service.domain.Order;

public interface OrderMapper {
    void create(Order order);
    void update(Order order);
    Order find(long orderId);
}
