package com.goca.ecommercejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title="Ecommerce Project Api With Springboot",
        description="Ecommerce backend project with springboot and spring security",
        version="v1",
        contact=@Contact(
                name="Code With Goca",
                email="goranmaaric@gmail.com"
        ),
        license=@License(
                name="Kodiraj sa Gocom"
        )
))
public class ECommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceApplication.class, args);
    }

}
