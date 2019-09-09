package com.puc.poc.financeiroadapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    private static final String BASE_PACKAGE = "com.puc.poc.financeiroadapter.http";

    @Bean
    public Docket documentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Financeiro")
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo());
    }

    @Bean
    public UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder().build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("PUC POC - Financeiro Adapter")
                .description("Financeiro  module.")
                .version("1.0")
                .build();
    }


}
