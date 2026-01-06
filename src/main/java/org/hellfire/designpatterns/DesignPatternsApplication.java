package org.hellfire.designpatterns;

import org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign.Application;
import org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign.DarkThemeFactory;
import org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign.LightThemeFactory;
import org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign.UIFactory;
import org.hellfire.designpatterns.designPatterns.creational.builderDesign.User;
import org.hellfire.designpatterns.designPatterns.creational.factoryMethodDesign.Notification;
import org.hellfire.designpatterns.designPatterns.creational.singletonDesign.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.hellfire.designpatterns.designPatterns.creational.factoryMethodDesign.NotificationFactory.createNotification;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        User user = new User.Builder("Himanshu", " Singh")
                .age(26)
                .city("Kanpur")
                .country("India")
                .build();
        System.out.println(user);

        Notification notification = createNotification("email");
        notification.sendNotification();

        UIFactory uiFactory = new LightThemeFactory();
        Application application = new Application(uiFactory);
        application.display();
        SpringApplication.run(DesignPatternsApplication.class, args);
    }

}
