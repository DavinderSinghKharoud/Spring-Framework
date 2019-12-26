package kharoud.springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Punjabi")
public class HelloWorldServicePunjabiImp implements HelloWorldService{


    @Override
    public String getGreeting() {
        return "kive oh sare jane";
    }
}
