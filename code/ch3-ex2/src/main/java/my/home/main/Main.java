package my.home.main;

import my.home.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        System.out.println(p.getName());
        System.out.println(p.getParrot());
    }
}