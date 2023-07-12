package datastructures;

import java.util.List;

public class HeapPriorityQueue<I extends Comparable<I>> implements PriorityQueue<I> {

    private Heap<I> contents;

    public HeapPriorityQueue() {
        contents = new ArrayListHeap<>();
    }

    public HeapPriorityQueue(List<I> intialContent) {
        contents = new ArrayListHeap<>(intialContent);
    }

    @Override
    public void enqueue(I newItem) {
        // TODO: Implementeer deze methode
    }

    @Override
    public I dequeue() {
        // TODO: Implementeer deze methode
        return null;
    }

    public int size() {
        return contents.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO: Implementeer deze methode
        return false;
    }
}
