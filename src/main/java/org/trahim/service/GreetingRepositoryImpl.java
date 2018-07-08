package org.trahim.service;

import org.springframework.stereotype.Component;


@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - primary greeting service.";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de salude primary.";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo - primärer Begrüßungsdienst.";
    }
}
