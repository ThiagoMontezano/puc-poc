package com.puc.poc.financeiroservice.gateway.impl;

import com.puc.poc.financeiroservice.domain.Payment;
import com.puc.poc.financeiroservice.gateway.PaymentGateway;
import com.puc.poc.financeiroservice.gateway.repository.PaymentRepository;
import com.puc.poc.financeiroservice.gateway.rest.PaymentEndpoint;
import com.puc.poc.financeiroservice.http.datacontract.PaymentAdapterRequestDataContract;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentGatewayImpl implements PaymentGateway {

    private final PaymentRepository paymentRepository;

    private final PaymentEndpoint paymentEndpoint;

    @Override
    public Payment save(final Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public ResponseEntity<Void> sendAdapterMakeCardPayment(final PaymentAdapterRequestDataContract paymentAdapterRequestDataContract){
        return paymentEndpoint.makeCardPayment(paymentAdapterRequestDataContract);
    }
}
