package com.itsoul.lab.bitcoin.app;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApiConfig {

    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        return mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
    }

    @Bean
    public ObjectWriter objectWriter(ObjectMapper mapper){
        return mapper.writerWithDefaultPrettyPrinter();
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().clientConnector(new ReactorClientHttpConnector()).build();
    }

}
