package hw.seminar2.Animals;

import java.time.LocalDate;

import hw.seminar2.interfaces.Goable;
import hw.seminar2.Illness;
import hw.seminar2.interfaces.Flyable;
import hw.seminar2.interfaces.Swimable;

public class Duck extends Animal implements Goable, Flyable, Swimable{
    public Duck(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
}
