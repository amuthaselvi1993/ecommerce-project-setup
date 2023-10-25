package com.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
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
            .apiInfo(getApiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.ecommerce"))
                    .paths(PathSelectors.any())
            .build();
    }

    private ApiInfo getApiInfo() {
    Contact contact = new Contact("sampleContact","http://sampleContactSite.com","amuthaselvi1993@gmail.com");
            return new ApiInfoBuilder()
                    .title("Sample E-Commerce")
                    .description("ECommerce api")
                    .version("1.0.0")
                    .license("Apache 2.0")
                    .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                    .contact(contact)
                    .build();
        }

    }
