package kharoud.springframework.di.services;


public class HelloWorldServiceFrenchImp implements HelloWorldService{


    @Override
    public String getGreeting() {
        return "Bonjour le monde";
    }
}
