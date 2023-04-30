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

    public boolean isEmpty(){
        return stack.isEmpty();
    }


}
