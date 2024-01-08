package my.home.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
