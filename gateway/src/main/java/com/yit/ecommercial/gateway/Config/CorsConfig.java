package com.yit.ecommercial.gateway.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfigurationSource = new CorsConfiguration();

        corsConfigurationSource.addAllowedHeader("*");
        corsConfigurationSource.addAllowedMethod("*");
        corsConfigurationSource.addAllowedOriginPattern("*");
        corsConfigurationSource.addAllowedOrigin("http://localhost:8001");
        corsConfigurationSource.setAllowCredentials(true);

        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfigurationSource);
        return new CorsWebFilter(urlBasedCorsConfigurationSource);
    }
}