package hw.seminar2.Animals;

import java.time.LocalDate;

import hw.seminar2.Illness;
import hw.seminar2.interfaces.Goable;

public class Dog extends Animal implements Goable {

    public Dog() {}
    
    public Dog(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

}
