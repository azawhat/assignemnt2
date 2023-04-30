import java.util.NoSuchElementException;

public class MyLinkedListQueue<E> {
    private MyLinkedList<E> queue;

    public MyLinkedListQueue(){
        queue = new MyLinkedList<E>();
    }

    public void enqueue(E element) {
        queue.add(element);
    }

    public E dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    public E peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }



    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
