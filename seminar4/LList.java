package seminar4.hw;

import java.util.List;

public interface LList<T> extends Iterable<T> {
    void addHead(T elem);
    void addTail(T elem);
    void remove(int index);
    T get(int index);
    int size();
}
