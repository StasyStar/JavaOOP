# Программа для создания экземпляров класса Animal и вывода их действий.
В ранее созданной программе с родительским классом Animal добавляются новые методы и наследованные классы.

Данная программа не является универсальной, т.к. для разных животных характерны разные методы и то, что умеет делать одно животное не могут делать другие.

Соответственно приходится для каждого класса переопределять методы, которые они не могут выполнить (например рыба не может ходить).
## Добавление в класс Animal методов бегать(toRun), летать(toFly), плавать(toSwim).
```
    public void toRun() {
        System.out.println(getType() + " is running");
    }

    public void toFly() {
        System.out.println(getType() + " is flying");
    }

    public void toSwim() {
        System.out.println(getType() + " is swimming");
    }
```
## Создание наследующих классов и переопределение методов из класса Animal в соответствии с классом животного
Создание по два класса наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
```
import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    public void toFly() {
        System.out.println(getType() + " can't fly!");
    }

    public void toSwim() {
        System.out.println(getType() + " don't wont to swim!");
    }
}
```
```
public class Fish extends Animal {
    public Fish(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    public void toRun() {
        System.out.println(getType() + " can't run!");
    }

    public void toFly() {
        System.out.println(getType() + " can't fly!");
    }
}
```
```
public class Duck extends Animal {
    public Duck(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
}
```
```
public class Dolphin extends Animal {
    public Dolphin(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    public void toRun() {
        System.out.println(getType() + " can't run!");
    }

    public void toFly() {
        System.out.println(getType() + " can't fly!");
    }
}
```
