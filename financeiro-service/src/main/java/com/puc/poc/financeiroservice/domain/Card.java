package com.puc.poc.financeiroservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    private String cardNumber;
    private String holder;
    private String expirationDate;
    private String securityCode;
    private Brand brand;

}
