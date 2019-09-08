package com.puc.poc.alunoservice.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String name;

    private String number;

    private String complement;

    private String cep;

    private String city;

    private String state;
}
