package com.puc.poc.financeiroservice.http.converter;

import com.puc.poc.financeiroservice.domain.Payment;
import com.puc.poc.financeiroservice.domain.Transaction;
import com.puc.poc.financeiroservice.http.datacontract.PaymentAdapterRequestDataContract;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PaymentAdapterRequestConverter implements Converter<Payment, PaymentAdapterRequestDataContract> {

    @Override
    public PaymentAdapterRequestDataContract convert(final Payment payment) {
        Transaction transaction = payment.getTransaction().stream().findFirst().get();
        return PaymentAdapterRequestDataContract
                .builder()
                .brand(transaction.getCard().getBrand())
                .cardNumber(transaction.getCard().getCardNumber())
                .expirationDate(transaction.getCard().getExpirationDate())
                .fingerprint(transaction.getFingerprint())
                .holder(transaction.getCard().getHolder())
                .identifier(payment.getId())
                .securityCode(transaction.getCard().getSecurityCode())
                .value(transaction.getValue())
                .build();
    }
}
