package seminar3.hw;

public abstract class Component implements Comparable<Component> {
    private String title;
    private double weight;
    private int power;

    public Component(String title, double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("title = %s, weight = %s, power = %d\n", title, weight, power);
    }

    public int compareTo(Component component) {
        return Integer.compare(this.power, component.power);
    }

    public int getPower() {
        return power;
    }
}
