package datastructures;

/**
 * @author Vincent Velthuizen
 * The basic functions any List should implement
 */
public interface List<E> {
    int size();

    E get(int index);

    void add(E element);

    void add(int index, E element);

    E remove(int index);
}
