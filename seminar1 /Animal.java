package seminar1;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected LocalDate birthday;
    protected Illness illness;

    public Animal(String name, LocalDate birthday, Illness illness) {
        this.name = name;
        this.birthday = birthday;
        this.illness = illness;
    }

    public Animal(){
        this("Var'ka", LocalDate.now(), new Illness("plague"));
    }

    private void wakeUp() {
        System.out.println(getType() + " waked up");
    }

    // private void wakeUp(String time) {
    //     System.out.println(getType() + " waked up at " + time);
    // }

    private void hunt() {
        System.out.println(getType() + " is hunting");
    }

    private void eat() {
        System.out.println(getType() + " is eating");
    }

    private void sleep() {
        System.out.println(getType() + " is sleeping");
    }

    public void toRun() {
        System.out.println(getType() + " is running");
    }

    public void toFly() {
        System.out.println(getType() + " is flying");
    }

    public void toSwim() {
        System.out.println(getType() + " is swimming");
    }

    public void lifeCycle() {
        wakeUp();
        hunt();
        eat();
        sleep();
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name = %s, birthday = %s, illness = %s", name, birthday, illness);
    }

}