package com.threatintel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Profile("dev") // Only apply this in development
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()  // Allow all requests in development
                )
                .csrf(csrf -> csrf.disable())  // Disable CSRF for H2 console
                .headers(headers -> headers
                        .frameOptions(frame -> frame.disable())  // Allow H2 console to load in iframe
                );

        return http.build();
    }
}