package seminar4.hw;

public class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> previous;

    @Override
    public String toString() {
        return value.toString();
    }
}
