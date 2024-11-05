package com.scaler.paymentservice.paymentgateway;

public interface PaymentGateway {
    String getPaymentLink(Long amount,String orderId,String phoneNumber,String name);
}
