package com.databricks.sdk;

import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppConfig {
  @Value("${server.port}")
  private int serverPort;

  @Bean
  public HttpClient getHttpClient() {
    return new CommonsHttpClient(30);
  }

  @Bean
  public ObjectMapper getObjectMapper() {
    ObjectMapper m = new ObjectMapper();
    m.registerModule(new JavaTimeModule());
    return m;
  }

  public int getServerPort() {
    return serverPort;
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests((requests) -> requests
            .anyRequest().permitAll());

    return http.build();
  }
}
