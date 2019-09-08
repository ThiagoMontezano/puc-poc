package com.puc.poc.alunoservice.gateway;

import com.puc.poc.alunoservice.domain.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends MongoRepository<Aluno, String> {

}
