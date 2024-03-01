package hw.seminar2.Animals;

import java.time.LocalDate;

import hw.seminar2.Illness;
import hw.seminar2.interfaces.Swimable;

public class Dolphin extends Animal implements Swimable{
    public Dolphin(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
}
