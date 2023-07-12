package datastructures;

import java.util.List;

public interface Heap<I extends Comparable<I>> {

    void addItem(I newItem);

    void addListOfItems(List<I> list);

    I removeItem();

    int size();

    boolean isEmpty();
}
