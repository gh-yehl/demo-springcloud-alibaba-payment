package com.yehl.serivice;

import com.yehl.domain.Payment;
import com.yehl.repository.PaymentRepository;
import com.yehl.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Transactional
    public String pay() {
        Payment payment = new Payment();
        payment.setId(1);
        payment.setValue(CommonUtils.generateInt());

        payment = paymentRepository.save(payment);

        return "订单支付成功!!!";
    }
}
