package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Payment;
import com.lambdaschool.getorders.repositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service (value = "paymentServices")
public class PaymentServiceImpl implements PaymentServices{
    @Autowired
    PaymentsRepository payrepos;

    @Override
    public Payment save(Payment payment) {
        return payrepos.save(payment);
    }
}
