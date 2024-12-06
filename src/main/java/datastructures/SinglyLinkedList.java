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
        Node<E> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        } else {
            Node<E> lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
        }

        size++;
    }

    @Override
    public void add(int index, E element) {
        // TODO 3 - add at a certain index
        // it might be useful to write a method to get a Node at a certain index...
        checkBounds(index, true);

        Node<E> newNode = new Node<>(element);

        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> previousNode = getNodeAtIndex(index - 1);
            newNode.setNext(previousNode.getNext());
            previousNode.setNext(newNode);
        }

        size++;
    }

    @Override
    public E get(int index) {
        // TODO 2 - be able to retrieve the things you have added
        checkBounds(index);

        Node<E> current = getNodeAtIndex(index);

        return current.getElement();
    }

    @Override
    public E remove(int index) {
        // TODO 4 - remove an element from the list and return the removed value
        checkBounds(index);
        E removed;

        if (index == 0) {
            removed = head.getElement();
            head = head.getNext();
        } else {
            Node<E> previous = getNodeAtIndex(index - 1);
            removed = previous.getNext().getElement();
            previous.setNext(previous.getNext().getNext());
        }

        size--;
        return removed;
    }

    private Node<E> getNodeAtIndex(int index) {
        checkBounds(index);

        Node<E> previousNode = head;
        for (int i = 0; i < index; i++) {
            previousNode = previousNode.getNext();
        }
        return previousNode;
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
