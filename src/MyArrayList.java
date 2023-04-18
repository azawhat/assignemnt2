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

}
