package com.puc.poc.financeiroservice.http.datacontract;

import com.puc.poc.financeiroservice.domain.Brand;
import lombok.*;

@Getter
@Setter
@Builder
public class PaymentAdapterRequestDataContract {

    private String identifier;

    private String cardNumber;

    private String holder;

    private String expirationDate;

    private String securityCode;

    private Brand brand;

    private String fingerprint;

    private Double value;

}
