package com.example.ShoppingSystem.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.ShoppingSystem.Controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());

    }
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Online Shopping",
                "Spring Boot REST API for Online Shopping",
                "1.0",
                "Terms of service",
                new Contact("Diyas Tursunkali", "https://tursunkali.diyas@gmail.com",
                        "tursunkali.diyas@gmail.com").toString(),
                "(C) Copyright Diyas Tursunkali",
                "https://www.copyright.org");
        return apiInfo;
    }
}
