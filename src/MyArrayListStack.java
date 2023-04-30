/*
 *   stack - variable type of MyLinkedList
 *   MyLinkedListStack - constructor for the class
 *   push - method in stack, to add   an element at the top of the stack.
 *   pop - removes and returns the top element if the stack. returns stack.size()-1
 *   peek - returns the first elements of the stack. returns stack.size()-1
 *   isEmpty - to check is stack empty or not
 *   size - to get the size of the stack
 * */


import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private MyArrayList<T> stack;

    public MyArrayListStack(){
        stack = new MyArrayList<T>();
    }

    public void push(T element){
        stack.add(element);
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() -1);
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

}
