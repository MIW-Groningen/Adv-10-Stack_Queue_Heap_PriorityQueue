package datastructures;

/**
 * @author Vincent Velthuizen
 * Purpose for the class
 */
public class DoubleEndedDoublyLinkedList<E> extends AbstractList<E> {
    private Node<E> head;
    private Node<E> tail;

    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return findNodeAt(index).getElement();
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);

        if (size == 0) {
            head = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
        }

        tail = newNode;
        size++;
    }

    @Override
    public void add(int index, E element) {
        checkBounds(index, true);
        Node<E> newNode = new Node<>(element);

        if (index == 0) {
            newNode.setNext(head);
            if (head != null) {
                head.setPrevious(newNode);
            }
            head = newNode;
        }

        if (index == size) {
            if (tail != null) {
                tail.setNext(newNode);
            }
            newNode.setPrevious(tail);
            tail = newNode;
        }

        if (index > 0 && index < size) {
            Node<E> current = findNodeAt(index);

            current.getPrevious().setNext(newNode);
            newNode.setPrevious(current.getPrevious());
            newNode.setNext(current);
            current.setPrevious(newNode);
        }

        size++;
    }

    @Override
    public E remove(int index) {
        Node<E> toBeRemoved = findNodeAt(index);

        if (index == 0) {
            head = head.getNext();
            if (head != null) {
                head.setPrevious(null);
            }
        }

        if (index == size - 1) {
            tail = tail.getPrevious();
            if (tail != null) {
                tail.setNext(null);
            }
        }

        if (index > 1 && index < size - 1) {
            toBeRemoved.getPrevious().setNext(toBeRemoved.getNext());
            toBeRemoved.getNext().setPrevious(toBeRemoved.getPrevious());
        }

        size--;
        return toBeRemoved.getElement();
    }

    private Node<E> findNodeAt(int index) {
        checkBounds(index);

        Node<E> current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }

        return current;
    }

    private static class Node<E> {
        private final E element;
        private Node<E> next;
        private Node<E> previous;

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

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }
    }
}
