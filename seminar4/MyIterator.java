package seminar4.hw;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    Node<T> previous;
    Node<T> current;

    public MyIterator(Node<T> head) {
        this.previous = null;
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        previous = current;
        current = current.next;
        return previous.value;
    }
}
