package hw.seminar2.Animals;
import hw.seminar2.*;

import java.time.LocalDate;

import hw.seminar2.interfaces.Goable;

public class Cat extends Animal implements Goable {

    public Cat() {}

    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
}
