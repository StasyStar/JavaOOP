package hw.seminar2.interfaces;

public interface Swimable {
    default void swim(double speed) {
        System.out.println(getClass().getSimpleName() + " is swimming with speed: " + speed);
    }
}
