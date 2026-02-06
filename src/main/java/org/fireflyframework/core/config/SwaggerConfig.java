package org.fireflyframework.core.config;

import org.fireflyframework.core.filters.FilterParameterCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public FilterParameterCustomizer filterParameterCustomizer() {
        return new FilterParameterCustomizer();
    }
}