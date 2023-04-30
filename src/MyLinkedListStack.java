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


}
