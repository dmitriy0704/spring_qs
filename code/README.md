### Изучение Spring и Spring Boot
#### Книга "Spring Быстро. Лауренциу Спилкэ"  


#### Глава 2. Контекст Spring.
_____// code: ch2-ex1_____
>***Бины в контекст добавляются:***
> - с помощью аннотации @Bean
> - с помощью стереотипных аннотаций
> - программно

***Создание контекста***

```java
в main:
var context = new AnnotationConfigApplicationContext()
```

##### 2.2.1. Добавление бинов в контекст Spring с помощью аннотации @Bean:
___// code: ch2-ex3___
>***Порядок действий:***
>1. Создать класс конфигурации с аннотацией @Configuration.
>2. Создать метод, возвращающий экземпляр объекта, который мы >хотим добавить в контекст Spring,
>3. Настроить спринг на ипользование этого класса конфигурации.

 ##### 2.2.2. Добавление бинов в контекст Spring с помощью стериотипных аннотаций:
___// code: ch2-ex6___
>***Порядок действий:***
>1. Классы необходимые для добавления помечаются анотацией @Component.
>2. Класс конфигурации помечается аннотацией @ComponentScan.
>@Postconstract - аннотация с помощью которой можно внести изменение в компонет после помещения в контекст.

##### 2.2.3. Программное добавление бинов в контекст Spring:
___// code: ch2-ex8___

```java
 var context =
    new AnnotationConfigApplicationContext(ProjectConfig.class);     
context.registerBean()
```

#### Глава 3. Контекст Spring: создание новых бинов.
>***Способы связи между бинами:***
>1. wiring - устанвока связи между бинами, вызывая методы создающие эти бины.
>2. auto-wiring - Spring предоаставляет значение через параметр метода.

##### 3.1. Установка связей между бинами, описанными в файле конфигурации.
___// code: ch3-ex1___

>***Порядок:***
>1. Добавить объекты в контекст -> класс конфигурации с помощью аннотации @Bean.
>2. Установка связи:

    - монтаж бинов путем прямого вызова одного метода с аннотацией @Bean из другого такого же метода

```java
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Ella");
         // Создаем ссылку на бин Parrot
        p.setParrot(parrot());
        return p;
    }
```

    - монтаж бинов путем передачи параметра в метод с аннотацией @Bean

```java
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");         
        p.setParrot(parrot);
        return p;
    }
```


##### 3.2. Внедрение бинов с помощью аннотациии @Autowired  
___// code: ch3-ex2___

>***Способы:***
>1. Внедрение значения класса в поле другого класа:
```java
    @Autowired
    private Parrot parrot;
```

>2. Внедрение значения через конструктор
```java
public class Person {
    private final Parrot parrot;
    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }
}
```
>3. Внедрение зависимости через сеттер.
```java
   @Autowired
   public void setParrot(Parrot parrot) {
       this.parrot = parrot;
   }
```

