package my.home.config;

import my.home.main.Parrot;
import my.home.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

//    @Bean
//    public Person person() {
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot()); // Создаем ссылку на бин Parrot
//        return p;
//    }

    // или

    @Bean
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot); // Создаем ссылку на бин Parrot
        return p;
    }
}
