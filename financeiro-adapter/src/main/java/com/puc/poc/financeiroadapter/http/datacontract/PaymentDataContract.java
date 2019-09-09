package com.puc.poc.financeiroadapter.http.datacontract;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class PaymentDataContract  {

    private String identifier;

    private String cardNumber;

    private String holder;

    private String expirationDate;

    private String securityCode;

    private BrandDataContract brand;

    private String fingerprint;

    private Double value;
}
