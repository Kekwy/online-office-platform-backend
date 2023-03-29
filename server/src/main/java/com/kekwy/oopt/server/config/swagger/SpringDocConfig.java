package com.kekwy.oopt.server.config.swagger;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger2 配置类
 *
 * @author Kekwy
 * @version 1.0
 * @since 2023/3/28 21:34
 */

@Configuration
public class SpringDocConfig {

    //    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.kekwy.oopt.server.controller"))
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("在线办公平台接口文档")
//                .description("demo")
//                .contact(new Contact("kekwy", "http://localhost:8081/doc.html", ""))
//                .version("1.0")
//                .build();
//
//    }
    @Bean
    public OpenAPI springDocOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("在线办公平台 API")
                        .description("Spring demo sample application")
                        .contact(new Contact().name("kekwy").url("http://localhost:8081/doc.html"))
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

}
