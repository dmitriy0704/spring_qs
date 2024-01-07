package my.home.config;

import my.home.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    @Primary
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Rich");
        return p;
    }

    @Bean(name = "b2")
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Kiko");
        return p;
    }

    @Bean
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Riko");
        return p;
    }


}
