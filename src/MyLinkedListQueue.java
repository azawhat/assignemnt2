import java.util.NoSuchElementException;

public class MyLinkedListQueue<E> {
    private MyLinkedList<E> queue;

    public MyLinkedListQueue(){
        queue = new MyLinkedList<E>();
    }

    public void enqueue(E element) {
        queue.add(element);
    }

}
