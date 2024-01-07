package my.home.config;

import my.home.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Rich");
        return p;
    }

    @Bean
    String str() {
        return "Hello";
    }

    @Bean
    Integer integer() {
        return 42;
    }
}
