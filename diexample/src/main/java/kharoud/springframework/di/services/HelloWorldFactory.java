package kharoud.springframework.di.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;

        switch (language){
            case "en":
                service = new HelloWorldServiceEngImp();
                break;
            case "pu":
                service = new HelloWorldServicePunjabiImp();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImp();
                break;
            case "hi":
                service = new HelloWorldServiceHindhiImp();
                break;
            default: new HelloWorldServiceEngImp();
        }

        return service;
    }
}
