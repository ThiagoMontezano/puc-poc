package com.puc.poc.financeiroservice.gateway;

import com.puc.poc.financeiroservice.domain.Payment;
import com.puc.poc.financeiroservice.http.datacontract.PaymentAdapterRequestDataContract;
import org.springframework.http.ResponseEntity;

public interface PaymentGateway {

    Payment save(Payment payment);

    ResponseEntity<Void> sendAdapterMakeCardPayment(final PaymentAdapterRequestDataContract paymentAdapterRequestDataContract);
}
