package com.tryton.res_order_service.domain;

public enum OrderState {
    APPROVAL_PENDING,
    APPROVED,
    REJECTED,
    CANCEL_PENDING,
    CANCELLED,
    REVISION_PENDING,
}
