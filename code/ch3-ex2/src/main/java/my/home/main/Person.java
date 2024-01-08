package my.home.main;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Person {
    private String name = "Ella";

    private Parrot parrot;
//    1. Способ - внедрение через поле класса:
//    @Autowired
//    private Parrot parrot;

//    2. Способ - внедрение через конструктор
//    private final Parrot parrot;
//    @Autowired
//    public Person(Parrot parrot) {
//        this.parrot = parrot;
//    }

    // 3. Способ - внедренеи через сеттер.
//    @Autowired
//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }
}
