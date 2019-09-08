package com.puc.poc.alunoservice.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

    private String nome;

    private String numero;

    private String complemento;

    private String cep;

    private String cidade;

    private String estado;
}
