package com.yehl.controller;

import com.yehl.serivice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping(value = "updatePayment" )
    public String updatePayment() {
        String paymentInfo = paymentService.pay();
        System.out.println(paymentInfo);
        return paymentInfo;
    }
}
