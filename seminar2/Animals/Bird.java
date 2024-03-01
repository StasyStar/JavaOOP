package hw.seminar2.Animals;
import hw.seminar2.*;

import java.time.LocalDate;

import hw.seminar2.interfaces.Goable;
import hw.seminar2.interfaces.Flyable;

public class Bird extends Animal implements Goable, Flyable{
    private int wingCount;

    public Bird(String name, LocalDate birthday, Illness illness, int wingCount) {
        super(name, birthday, illness);
        this.wingCount = wingCount;
    }

    @Override
    public String toString() {
        return String.format("name = %s, birthday = %s, illness = %s, wingCount = %d", name, birthday, illness, wingCount);
    }
}
