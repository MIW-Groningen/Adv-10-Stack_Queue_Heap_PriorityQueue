package datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListQueue<E> implements Queue<E> {

    private List<E> contents;

    public ArrayListQueue() {
        super();
        contents = new ArrayList<>();
    }

    public void enqueue(E element) {
        // TODO implementeer deze methode
    }

    public E dequeue() {
        // TODO implementeer deze methode
        return null;
    }

    public boolean isEmpty() {
        // TODO implementeer deze methode
        return false;
    }

    @Override
    public int size() {
        return contents.size();
    }
}
