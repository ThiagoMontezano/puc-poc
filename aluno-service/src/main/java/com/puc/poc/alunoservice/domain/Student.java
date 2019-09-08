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
public class Student {

    @Id
    private String id;

    @NotBlank
    private String cpf;

    @NotBlank
    private String fullName;

    @NotBlank
    private String email;

    private List<String> phones;

    @NotNull
    private LocalDate bornDate;

    private LocalDateTime createdAt;

    private Address address;

    private Boolean active;

    private String contactName;

    private String contactPhone;


}
