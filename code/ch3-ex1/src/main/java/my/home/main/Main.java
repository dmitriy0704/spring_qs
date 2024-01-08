package my.home.main;

import my.home.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println(
                "Person: " + person.getName() + "\n" +
                "Parrot: " + parrot.getName() + "\n" +
                "Person`s parrot: " + person.getParrot()
        );
    }
}