package org.hellfire.designpatterns;

import org.hellfire.designpatterns.designPatterns.creational.builderDesign.User;
import org.hellfire.designpatterns.designPatterns.creational.singletonDesign.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        User user = new User.Builder("Himanshu", " Singh")
//                .age(26)
                .city("Kanpur")
                .country("India")
                .build();
        System.out.println(user);
        SpringApplication.run(DesignPatternsApplication.class, args);
    }

}
