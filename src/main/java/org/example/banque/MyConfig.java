package org.example.banque;

import org.example.banque.web.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jServlet = new ResourceConfig();
        jServlet.register(CompteRestJaxRSAPI.class);
        return jServlet;
    }
}
