package com.puc.poc.financeiroservice.gateway.repository;

import com.puc.poc.financeiroservice.domain.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {

}
