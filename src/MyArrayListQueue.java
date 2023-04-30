import java.util.NoSuchElementException;

public class MyArrayListQueue<E> {
    private MyArrayList<E> queue;

    public MyArrayListQueue(){
        queue = new MyArrayList<E>();
    }

    public void enqueue(E element){
        queue.add(element);
    }

    public E dequeue(){
        if(isEmpty()) {
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

    public int size(){
        return queue.size();
    }
}
