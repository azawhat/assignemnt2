import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> {

    private static final int INITIAL_CAPACITY = 10;

    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }
    public boolean add(E element) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = element;
        size++;
        return true;
    }


    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
}
