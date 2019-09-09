package com.puc.poc.financeiroservice.http.datacontract;

import com.puc.poc.financeiroservice.domain.Brand;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PaymentDataContract {

    private String studentId;

    private String referenceDocumentNumber;

    private String cardNumber;

    private String holder;

    private String expirationDate;

    private String securityCode;

    private Brand brand;

    private String fingerprint;

    private Double value;

    private LocalDate dueDate;

}
