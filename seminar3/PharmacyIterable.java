package seminar3.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyIterable implements Iterable<Component>, Comparable<PharmacyIterable> {
    private List<Component> components;
    private int index;
    private int size = 0;

    public PharmacyIterable() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public PharmacyIterable addComponent(Component item) {
        size++;
        components.add(item);
        return this;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getComponent(int index) {
        return components.get(index);
    }

    public int getIndex() {
        return index;
    }

    @Override
    public Iterator<Component> iterator() {
        return new MyIterator(this);
    }

    public int getTotalPower() {
        int totalPower = 0;
        for (Component component : components) {
            totalPower += component.getPower();
        }
        return totalPower;
    }

    @Override
    public int compareTo(PharmacyIterable medicineList) {
        return Integer.compare(this.getTotalPower(), medicineList.getTotalPower());
    }

    @Override
    public String toString() {
        return String.format("composition: %s\n", components);
    }
}

