package kharoud.springframework.di.controllers;

import kharoud.springframework.di.services.HelloWorldService;
import kharoud.springframework.di.services.HelloWorldServiceHindhiImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceHindhi;

    private HelloWorldService helloWorldServiceFrench;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldServiceHindhi")
    public void setHelloWorldServiceHindhi(HelloWorldService helloWorldServiceHindhi){
        this.helloWorldServiceHindhi = helloWorldServiceHindhi;
    }

    @Autowired
    @Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench){
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }           

    public String sayHello(){

        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);

        System.out.println(helloWorldServiceHindhi.getGreeting());

        System.out.println(helloWorldServiceFrench.getGreeting());
        return greeting;
    }
}
