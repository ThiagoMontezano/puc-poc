package com.puc.poc.financeiroservice.http.controller;


import com.puc.poc.financeiroservice.domain.Payment;
import com.puc.poc.financeiroservice.http.converter.PaymentConverter;
import com.puc.poc.financeiroservice.http.datacontract.PaymentDataContract;
import com.puc.poc.financeiroservice.usecase.PaymentProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/payment", produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentConverter paymentConverter;

    private final PaymentProcessor paymentProcessor;

    @PostMapping
    public ResponseEntity<Payment> makeCardPayment(@RequestBody PaymentDataContract paymentDataContract) {
        final Payment payment = paymentConverter.convert(paymentDataContract);

        return ResponseEntity
                .accepted()
                .body(paymentProcessor.makeCardPayment(payment));
    }

}
