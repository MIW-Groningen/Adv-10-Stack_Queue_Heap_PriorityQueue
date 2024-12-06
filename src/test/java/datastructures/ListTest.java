package datastructures;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Vincent Velthuizen
 * Generic tests for List operations
 */
public class ListTest {

    public static <L extends List<Integer>> void addOne(L intList) {
        intList.add(0);

        assertAll(
                () -> assertEquals(1, intList.size(), "The list should have size 1"),
                () -> assertEquals(0, intList.get(0), "The element at index 0 should be 0"),
                () -> assertEquals("[0]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void addMultiple(L intList) {
        intList.add(3);
        intList.add(2);
        intList.add(1);
        intList.add(0);

        assertAll(
                () -> assertEquals(4, intList.size(), "The list should have size 4"),
                () -> assertEquals(3, intList.get(0), "The element at index 0 should be 3"),
                () -> assertEquals(2, intList.get(1), "The element at index 0 should be 2"),
                () -> assertEquals(1, intList.get(2), "The element at index 0 should be 1"),
                () -> assertEquals(0, intList.get(3), "The element at index 0 should be 0"),
                () -> assertEquals("[3, 2, 1, 0]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void addAtIndex(L intList) {
        intList.add(0, 1);
        intList.add(0, 0);

        assertAll(
                () -> assertEquals(2, intList.size(), "The list should have size 2"),
                () -> assertEquals(0, intList.get(0), "The element at index 0 should be 0"),
                () -> assertEquals(1, intList.get(1), "The element at index 1 should be 1"),
                () -> assertEquals("[0, 1]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void addMultipleAtIndex(L intList) {
        intList.add(0, 1);
        intList.add(0, 0);
        intList.add(2, 4);
        intList.add(2, 3);
        intList.add(2, 2);

        assertAll(
                () -> assertEquals(5, intList.size(), "The list should have size 5"),
                () -> assertEquals(0, intList.get(0), "The element at index 0 should be 0"),
                () -> assertEquals(1, intList.get(1), "The element at index 1 should be 1"),
                () -> assertEquals(2, intList.get(2), "The element at index 2 should be 2"),
                () -> assertEquals(3, intList.get(3), "The element at index 3 should be 3"),
                () -> assertEquals(4, intList.get(4), "The element at index 4 should be 4"),
                () -> assertEquals("[0, 1, 2, 3, 4]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void removeElement(L intList) {
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        int removed = intList.remove(2);

        assertAll(
                () -> assertEquals(4, intList.size(), "The list should have size 4"),
                () -> assertEquals(2, removed, "The removed element should be 2"),
                () -> assertEquals(0, intList.get(0), "The element at index 0 should be 0"),
                () -> assertEquals(1, intList.get(1), "The element at index 1 should be 1"),
                () -> assertEquals(3, intList.get(2), "The element at index 2 should be 3"),
                () -> assertEquals(4, intList.get(3), "The element at index 3 should be 4"),
                () -> assertEquals("[0, 1, 3, 4]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void removeFirstElement(L intList) {
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        int removed = intList.remove(0);

        assertAll(
                () -> assertEquals(4, intList.size(), "The list should have size 4"),
                () -> assertEquals(0, removed, "The removed element should be 0"),
                () -> assertEquals(1, intList.get(0), "The element at index 0 should be 1"),
                () -> assertEquals(2, intList.get(1), "The element at index 1 should be 2"),
                () -> assertEquals(3, intList.get(2), "The element at index 2 should be 3"),
                () -> assertEquals(4, intList.get(3), "The element at index 3 should be 4"),
                () -> assertEquals("[1, 2, 3, 4]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void removeLastElement(L intList) {
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        int removed = intList.remove(4);

        assertAll(
                () -> assertEquals(4, intList.size(), "The list should have size 4"),
                () -> assertEquals(4, removed, "The removed element should be 4"),
                () -> assertEquals(0, intList.get(0), "The element at index 0 should be 0"),
                () -> assertEquals(1, intList.get(1), "The element at index 1 should be 1"),
                () -> assertEquals(2, intList.get(2), "The element at index 2 should be 2"),
                () -> assertEquals(3, intList.get(3), "The element at index 3 should be 3"),
                () -> assertEquals("[0, 1, 2, 3]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void removeFirstOfTwoElement(L intList) {
        intList.add(0);
        intList.add(1);

        int removed = intList.remove(0);

        assertAll(
                () -> assertEquals(1, intList.size(), "The list should have size 1"),
                () -> assertEquals(0, removed, "The removed element should be 0"),
                () -> assertEquals("[1]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void removeLastOfTwoElement(L intList) {
        intList.add(0);
        intList.add(1);

        int removed = intList.remove(1);

        assertAll(
                () -> assertEquals(1, intList.size(), "The list should have size 1"),
                () -> assertEquals(1, removed, "The removed element should be 1"),
                () -> assertEquals("[0]", intList.toString())
        );
    }

    public static <L extends List<Integer>> void removeOnlyElement(L intList) {
        intList.add(0);

        int removed = intList.remove(0);

        assertAll(
                () -> assertEquals(0, intList.size(), "The list should have size 1"),
                () -> assertEquals(0, removed, "The removed element should be 1"),
                () -> assertEquals("[]", intList.toString())
        );
    }

}
