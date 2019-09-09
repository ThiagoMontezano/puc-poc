package com.puc.poc.financeiroservice.http.converter;

import com.puc.poc.financeiroservice.domain.Card;
import com.puc.poc.financeiroservice.domain.Payment;
import com.puc.poc.financeiroservice.domain.StatusPayment;
import com.puc.poc.financeiroservice.domain.Transaction;
import com.puc.poc.financeiroservice.http.datacontract.PaymentDataContract;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collections;

@Component
public class PaymentConverter implements Converter<PaymentDataContract, Payment> {

    @Override
    public Payment convert(final PaymentDataContract paymentDataContract) {
        final Payment payment = new Payment();
        BeanUtils.copyProperties(paymentDataContract, payment);

        payment.setPaymentDate(LocalDate.now());
        payment.setStatusPayment(StatusPayment.pending);

        final Card card = new Card();
        BeanUtils.copyProperties(paymentDataContract, card);

        final Transaction transaction = new Transaction();
        transaction.setCard(card);
        transaction.setFingerprint(paymentDataContract.getFingerprint());
        transaction.setValue(paymentDataContract.getValue());

        payment.setTransaction(Collections.singletonList(transaction));

        return payment;
    }
}
