package com.puc.poc.financeiroadapter.http.controller;


import com.puc.poc.financeiroadapter.http.datacontract.PaymentDataContract;
import com.puc.poc.financeiroadapter.usecase.CallBraspag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/payment", produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class PaymentAdapterController {

    private final CallBraspag callBraspag;

    @PostMapping(value = "/card")
    public ResponseEntity<PaymentDataContract> makeCardPayment(@RequestBody PaymentDataContract paymentDataContract) {
        callBraspag.execute();
        log.info("endpoint=PaymentAdapterController#makeCardPayment, paymentDataContract{}", paymentDataContract);
        return ResponseEntity
                .ok()
                .body(paymentDataContract);
    }

}
