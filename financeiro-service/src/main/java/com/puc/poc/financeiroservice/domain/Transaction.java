package com.puc.poc.financeiroservice.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {

    private Card card;

    private String fingerprint;

    private Double value;

    private Boolean processed;

}
