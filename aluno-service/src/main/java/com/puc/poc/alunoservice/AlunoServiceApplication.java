package com.puc.poc.alunoservice;

import com.puc.poc.alunoservice.domain.Address;
import com.puc.poc.alunoservice.domain.Student;
import com.puc.poc.alunoservice.gateway.StudentRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class AlunoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlunoServiceApplication.class, args);
	}

}
