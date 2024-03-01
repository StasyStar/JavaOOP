package seminar1;

import java.time.LocalDate;

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
