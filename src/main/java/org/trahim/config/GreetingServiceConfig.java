package org.trahim.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.trahim.service.GreetingRepository;
import org.trahim.service.GreetingService;
import org.trahim.service.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory getServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService primaryGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"de", "default"})
    GreetingService primaryGermanGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService rimarySpanishGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("es");
    }



}
