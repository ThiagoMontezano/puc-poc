package com.puc.poc.alunoservice.config.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -987654327165446644L;

    private final String jwtToken;
    
}

