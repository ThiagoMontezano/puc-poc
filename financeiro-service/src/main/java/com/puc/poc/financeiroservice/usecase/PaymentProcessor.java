package com.puc.poc.financeiroservice.usecase;


import com.puc.poc.financeiroservice.domain.Payment;
import com.puc.poc.financeiroservice.gateway.PaymentGateway;
import com.puc.poc.financeiroservice.http.converter.PaymentAdapterRequestConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentProcessor {

    private final PaymentGateway paymentGateway;

    private final PaymentAdapterRequestConverter converter;

    public Payment makeCardPayment(final Payment payment) {
        final Payment newPayment = paymentGateway.save(payment);
        paymentGateway.sendAdapterMakeCardPayment(converter.convert(newPayment));
        return newPayment;
    }
}
