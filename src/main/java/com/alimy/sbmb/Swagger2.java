package com.alimy.sbmb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置类
 * @author huangshengyang
 *
 */

@Configuration
@EnableSwagger2
public class Swagger2 {
    
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.alimy.sbmb.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    
    
    public ApiInfo apiInfo(){
        Contact contact = new Contact();
        contact.setName("alimy");
        contact.setEmail("alimy@123.com");
        contact.setUrl("www.alimy.com");
        return new ApiInfoBuilder()
                .title("springboot整合swagger")
                .description("descriiption_name")
                .termsOfServiceUrl("https://www.alimy.com")
                .contact("alimy")
                .version("1.0")
                .build();
    }
    
}
