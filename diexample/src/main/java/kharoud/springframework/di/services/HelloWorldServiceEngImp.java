package kharoud.springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default","English"})
public class HelloWorldServiceEngImp implements HelloWorldService{


    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
