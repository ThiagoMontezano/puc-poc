package com.puc.poc.financeiroservice.gateway.rest;

public interface PaymentConstants {

    String serviceName = "${integration.payment-adapter-api.name:}";

    String serviceUrl = "${integration.payment-adapter-api.url:}";
}