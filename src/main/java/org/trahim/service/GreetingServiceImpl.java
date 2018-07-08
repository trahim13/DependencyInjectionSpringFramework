package org.trahim.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello- greeting service impl.";
    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
