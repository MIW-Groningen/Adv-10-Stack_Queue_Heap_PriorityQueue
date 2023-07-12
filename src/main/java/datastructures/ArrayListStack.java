package datastructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<E> implements Stack<E> {

    private List<E> contents;

    public ArrayListStack() {
        super();
        contents = new ArrayList<>();
    }

    public void push(E e) {
        // TODO
    }

    public E pop() {
        // TODO
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO
        return true;
    }

    @Override
    public int size() {
        // TODO
        return 0;
    }
}
