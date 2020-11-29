package com.george.springcloud.service;


import com.george.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
