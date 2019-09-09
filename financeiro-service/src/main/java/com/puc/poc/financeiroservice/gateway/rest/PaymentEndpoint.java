package com.puc.poc.financeiroservice.gateway.rest;

import com.puc.poc.financeiroservice.http.datacontract.PaymentAdapterRequestDataContract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url =PaymentConstants.serviceUrl, name = PaymentConstants.serviceName)
@Profile("!test")
public interface PaymentEndpoint {

    @PostMapping(value = "/v1/payment/card", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> makeCardPayment(final PaymentAdapterRequestDataContract paymentAdapterRequestDataContract);
    //ResponseEntity<PaymentAdapterDataContractResponse> makeCardPayment(final PaymentAdapterRequestDataContract paymentAdapterDataContractRequest);
}
