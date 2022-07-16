package com.tryton.res_order_service.domain;

import java.util.List;

public class Order {
    private List<OrderLineItem> orderLineItems;
    private DeliveryInformation deliveryInformation;
    private PaymentInformation paymentInformation;
}
