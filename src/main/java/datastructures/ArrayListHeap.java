package datastructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHeap<I extends Comparable<I>> implements Heap<I> {

    private List<I> contents;

    public ArrayListHeap() {
        contents = new ArrayList<>();
    }

    public ArrayListHeap(List<I> list) {
        this();
        this.addListOfItems(list);
    }

    @Override
    public void addItem(I newItem) {
        // TODO: Implementeer deze methode
    }

    @Override
    public void addListOfItems(List<I> list) {
        // TODO: Implementeer deze methode
    }


    @Override
    public I removeItem() {
        // TODO: Implementeer deze methode
        return null;
    }

    private void swim(int index) {
        // TODO: Implementeer deze methode
        // Gebruik de swim uit de presentatie en bouw die om
    }

    private void sink(int index) {
        // TODO: Implementeer deze methode
        // Gebruik de sink uit de presentatie en bouw die om

    }

    public int size() {
        return contents.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        return contents.toString();
    }

}
