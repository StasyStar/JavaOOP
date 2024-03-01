package seminar4.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList<T> implements LList<T> {
    int size;
    Node<T> head;
    Node<T> tail;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    } 

    @Override
    public void addHead(T elem) {
        Node<T> newNode = new Node<>();
        newNode.value = elem;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    public void addTail(T elem) {
        Node<T> newNode = new Node<>();
        newNode.value = elem;
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        } if (index == 0) {
            head = head.next;
            head.previous = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i != index; i++) {
                current = current.next;
            }
            if (current.next != null) {
                current.next.previous = current.previous;
            }
            current.previous.next = current.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;     
    }

    private boolean isOutOfBounds(int index) {
        return index < 0 || index >= size;
    }

    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder sb = new StringBuilder("{");
        while (current != null) {
            sb.append(current.value).append(",");
            current = current.next;
        }
        if (sb.length() == 1) return "{}";
        sb.deleteCharAt(sb.length() - 1).append("}");
        return sb.toString();
    }

    public Iterator<T> iterator() {
        return new MyIterator<>(head);
    }
}
