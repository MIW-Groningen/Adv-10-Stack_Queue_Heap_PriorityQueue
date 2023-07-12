package datastructures;


public interface PriorityQueue<I extends Comparable<I>> {

    void enqueue(I newItem);

    I dequeue();

    boolean isEmpty();

}
