/*
 *   queue - variable type of MyArrayList
 *   MyLinkedListQueue - constructor for the class
 *   enqueue  - method in queue to add  an element at the end of the queue.
 *   dequeue - removes and returns the front element of the queue.
 *   peek - returns the first elements of the queue.
 *   isEmpty - to check is queue empty or not
 *   size - to get the size of the queue
 * */


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
