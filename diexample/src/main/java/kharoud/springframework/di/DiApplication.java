package kharoud.springframework.di;

import kharoud.springframework.di.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sun.java2d.windows.GDIRenderer;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

        GreetingController controller = (GreetingController)ctx.getBean("greetingController");
        controller.sayHello();
    }

}
