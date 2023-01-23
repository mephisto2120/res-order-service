package com.tryton.res_order_service.domain;

import java.util.List;

import static com.tryton.res_order_service.domain.OrderState.APPROVAL_PENDING;

public class Order {
    private Long id;

    private Long version;

    private OrderState state;

    private Long consumerId;
    private Long restaurantId;

    private OrderLineItems orderLineItems;

    private DeliveryInformation deliveryInformation;

    private PaymentInformation paymentInformation;


    private Money orderMinimum = new Money(Integer.MAX_VALUE);

    private Order() {
    }

    public Order(long consumerId, long restaurantId, DeliveryInformation deliveryInformation, List<OrderLineItem> orderLineItems) {
        this.consumerId = consumerId;
        this.restaurantId = restaurantId;
        this.deliveryInformation = deliveryInformation;
        this.orderLineItems = new OrderLineItems(orderLineItems);
        this.state = APPROVAL_PENDING;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeliveryInformation getDeliveryInformation() {
        return deliveryInformation;
    }

    public Money getOrderTotal() {
        return orderLineItems.orderTotal();
    }

    public Long getVersion() {
        return version;
    }

    public List<OrderLineItem> getLineItems() {
        return orderLineItems.getLineItems();
    }

    public OrderState getState() {
        return state;
    }

    public long getRestaurantId() {
        return restaurantId;
    }


    public Long getConsumerId() {
        return consumerId;
    }

    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(PaymentInformation paymentInformation) {
        this.paymentInformation = paymentInformation;
    }
}
