package my.home.main;

import my.home.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean("b2", Parrot.class); //  вызываетсы по имени бина или приоритный бин
//        Parrot p = context.getBean(Parrot.class); //  вызываетсы по имени бина или приоритный бин
        System.out.println(p.getName());


    }
}