package com.sofency.top.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author sofency
 * @date 2020/7/16 0:06
 * @package IntelliJ IDEA
 * @description
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "spring cloud with consul"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
