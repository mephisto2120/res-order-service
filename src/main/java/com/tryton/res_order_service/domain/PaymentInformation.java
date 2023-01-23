package com.tryton.res_order_service.domain;

import java.util.Objects;

public class PaymentInformation {
    private String paymentToken;

    public PaymentInformation(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    public String getPaymentToken() {
        return paymentToken;
    }

    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentInformation that = (PaymentInformation) o;
        return paymentToken.equals(that.paymentToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentToken);
    }
}
