package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Vincent Velthuizen
 * Test the SinglyLinkedList for all basic List operations
 */
class SinglyLinkedListTest {
    private SinglyLinkedList<Integer> intList;

    @BeforeEach
    public void initialize() {
        intList = new SinglyLinkedList<>();
    }

    @Test
    @DisplayName("1a & 2a - add() and get() (and toString which was given)")
    void addOne() {
        ListTest.addOne(intList);
    }

    @Test
    @DisplayName("1b & 2b - add() and get() for a longer list")
    void addMultiple() {
        ListTest.addMultiple(intList);
    }

    @Test
    @DisplayName("3a - add(index, element) for a minimal example")
    void addAtIndex() {
        ListTest.addAtIndex(intList);
    }

    @Test
    @DisplayName("3b - add(index, element) for a larger example")
    void addMultipleAtIndex() {
        ListTest.addMultipleAtIndex(intList);
    }

    @Test
    @DisplayName("4 - remove(index)")
    void remove() {
        ListTest.removeElement(intList);
    }
}