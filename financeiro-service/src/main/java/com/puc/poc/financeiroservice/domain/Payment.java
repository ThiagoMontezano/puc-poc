package com.puc.poc.financeiroservice.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Getter
@Setter
public class Payment {

    @Id
    private String id;

    private String studentId;

    private String referenceDocumentNumber;

    private List<Transaction> transaction;

    private LocalDate paymentDate;

    private LocalDate dueDate;

    private StatusPayment statusPayment;

    private String remark;
}
