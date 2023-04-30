/*
*   stack - variable type of MyLinkedList
*   MyLinkedListStack - constructor for the class
*   push - method in stack, to add   an element at the top of the stack.
*   pop - removes and returns the top element if the stack
*   peek - returns the first elements of the stack
*   isEmpty - to check is stack empty or not
*   size - to get the size of the stack
* */


import java.util.EmptyStackException;


public class MyLinkedListStack<T> {
    private MyLinkedList<T> stack;
    public MyLinkedListStack() {
        stack = new MyLinkedList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop(){
        if (isEmpty())  {
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }

    public T peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(0);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

}
