package seminar1;

import java.time.LocalDate;

public class Bird extends Animal {
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
