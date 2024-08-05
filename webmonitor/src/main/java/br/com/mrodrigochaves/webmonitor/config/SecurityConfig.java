package br.com.mrodrigochaves.webmonitor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Desativa a proteção CSRF
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/api/sites/**").permitAll() 
                .anyRequest().authenticated() 
            )
            .httpBasic(); 

        return http.build();
    }
}
