package com.puc.poc.alunoservice.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Document
@Getter
@Setter
public class Aluno {

    @Id
    private String id;

    @NotBlank
    private String cpf;

    @NotBlank
    private String nomeCompleto;

    @NotBlank
    private String email;

    private List<String> telefones;

    @NotNull
    private LocalDate dataNascimento;

    private LocalDateTime dataRegistro;

    private Endereco endereco;

    private Boolean ativo;

    private String nomeContato;

    private String telefoneContato;


}
