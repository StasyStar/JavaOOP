package hw.seminar2.interfaces;

public interface Goable {
    default void run(double speed) {
        System.out.println(getClass().getSimpleName() + " is running with speed: " + speed);
    }
}
