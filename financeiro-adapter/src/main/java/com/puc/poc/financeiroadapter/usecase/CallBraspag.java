package com.puc.poc.financeiroadapter.usecase;

import org.springframework.stereotype.Component;

@Component
public class CallBraspag {

    public void execute(){
        // Aqui vai estar a regra para chamar o gateway de pagamento da braspag
        // Tratativas para em caso de instabilidade do gateway externo publicar em um topico do Kafka para retentativa
        // O listener para retentativa entre outras caracteristicas que fizerem parte do processo
    }
}
