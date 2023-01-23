package com.tryton.res_order_service.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OrderLineItem {
    private int quantity;
    private String menuItemId;
    private String name;
    private Money price;

    public OrderLineItem(String menuItemId, String name, Money price, int quantity) {
        this.menuItemId = menuItemId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMenuItemId(String menuItemId) {
        this.menuItemId = menuItemId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMenuItemId() {
        return menuItemId;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    public Money getTotal() {
        return price.multiply(quantity);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
