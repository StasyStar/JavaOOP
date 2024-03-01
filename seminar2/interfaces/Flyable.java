package hw.seminar2.interfaces;

public interface Flyable {
    default void fly(double speed) {
        System.out.println(getClass().getSimpleName() + " is flying with speed: " + speed);
    }
}
