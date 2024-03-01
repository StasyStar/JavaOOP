package seminar3.hw;

import java.util.Iterator;

public class MyIterator implements Iterator<Component> {
    private PharmacyIterable pharmacyIterable;
    private int index;
    
    public MyIterator(PharmacyIterable pharmacyIterable) {
        this.pharmacyIterable = pharmacyIterable;
        this.index = pharmacyIterable.getIndex();
    }

    @Override
    public boolean hasNext() {
        return pharmacyIterable.getIndex() < pharmacyIterable.getSize() - 1;
    }

    @Override
    public Component next() {
        index++;
        pharmacyIterable.setIndex(index);
        return pharmacyIterable.getComponents().get(index);
    }
    
}