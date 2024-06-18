package com.codesy.blogsystem.web.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI springOpenAPI() {
        // 访问路径：http://localhost:8080/swagger-ui/index.html
        return new OpenAPI().info(new Info()
                .title("CodeSY API Doc")
                .description("CodeSY API Doc Application")
                .version("1.0.0"));
    }
}
