package com.example.WildCare_API.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity

public  class SecurityConfiguration {
    @Value("${api-endpoint}")
    String endpoint;

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {
       http
               .cors(withDefaults())
               .csrf(csrf -> csrf.disable())
               .formLogin(form -> form.disable())
               .authorizeHttpRequests(auth -> auth
                       .requestMatchers(endpoint + "/admin").permitAll()
                       .anyRequest().authenticated()
               )
               .httpBasic(withDefaults());

        return http.build();
    }
}