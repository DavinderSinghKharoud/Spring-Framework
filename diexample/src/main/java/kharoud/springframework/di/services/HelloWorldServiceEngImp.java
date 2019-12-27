package kharoud.springframework.di.services;


public class HelloWorldServiceEngImp implements HelloWorldService{


    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
