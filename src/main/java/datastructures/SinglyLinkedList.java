package datastructures;

/**
 * @author Vincent Velthuizen
 * A singly linked list to be further developed as an exercise
 */
public class SinglyLinkedList<E> extends AbstractList<E> {
    private Node<E> head;
    private int size;

    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        // TODO 1 - start here, be able to add things
    }

    @Override
    public void add(int index, E element) {
        // TODO 3 - add at a certain index
        // it might be useful to write a method to get a Node at a certain index...
    }

    @Override
    public E get(int index) {
        // TODO 2 - be able to retrieve the things you have added
        return null;
    }

    @Override
    public E remove(int index) {
        // TODO 4 - remove an element from the list and return the removed value
        return null;
    }

    private static class Node<E> {
        private final E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
