# Assignment 2 and Assignment 3
This is the second and third assignments of the Algorithms and Data Structure course.


**_About MyArrayList_** 
**[Link](https://github.com/azawhat/assignemnt2/blob/main/src/MyArrayList.java)**

**1. Create a new class called MyArrayList that implements the List interface.**

_Explanation:_ New class MyArrayList that implements List interface.
```
public class MyArrayList<E> implements List<E>{}
```

**2. Define a private instance variable of type Object[] to hold the elements of the list.**

_Explanation:_ Private instance variable of type Object[]
```
private Object[] elements;
```

**3. Define an int variable called size to keep track of the number of elements in the list.**

_Explanation:_ Private int variable `size`
```
private int size;
```

**4. Implement the add(E element) method by first checking if the size of the array is large enough to accommodate the new element. If it is not, create a new array with double the size of the original array, copy over the elements from the original array, and then add the new element. Otherwise, simply add the new element to the end of the array and increment the size variable.**

_Explanation:_ If it is running out of limit it will resize to add one element. To that there is given one more method `resize`. That method doubles the size of the original array and copy all elements..
```
public boolean add(E element) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = element;
        size++;
        return true;
    }
private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
```

**5. Implement the get(int index) method by returning the element at the specified index.**

_Explanation:_ A function that gets value of the element at one index. It is showed in the `return`
```
public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }
```

**6. Implement the remove(int index) method by removing the element at the specified index, shifting all subsequent elements to the left by one position, and decrementing the size variable.**

_Explanation:_ A function that removes an element at one index. If `index<0` or `index >= size` it means it is out of bounds, so it shows `IndexOutOfBoundsException()`
```
public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E element = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[size - 1] = null;
        size--;
        return element;
    }
```

**7. Implement the size() method by returning the size variable.**

_Explanation:_ A function that returns value of the `size`
```
public int size() {
        return size;
    }
```


**_About MyLinkedList_**
**[Link](https://github.com/azawhat/assignemnt2/blob/main/src/MyLinkedList.java)**

**1. Create a new class called MyLinkedList that implements the List interface.**

_Explanation:_ Creating class `MyLinkedList`
```
public class MyLinkedList<E> {}
```
**2. Define a private inner class called Node that contains an element of type E and references to the next and previous nodes in the list.**

_Explanation:_ Private inner class Node. Element of type E and references to other nodes`
```
private class Node {
        private E element;
        private Node next;
        private Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
```
**3. Define a private instance variable called head that references the first node in the list.**

_Explanation:_ Variable `head`
```
private Node head;
```
**4. Define a private instance variable called tail that references the last node in the list.**

_Explanation:_ Variable `tail`
```
private Node tail;
```
**5. Define an int variable called size to keep track of the number of elements in the list.**

_Explanation:_ Variable `size`
```
private int size;
```
**6. Implement the add(E element) method by creating a new Node with the specified element, setting its next reference to null (since it will be the new tail), and its previous reference to the current tail. If the list is empty, set both the head and tail references to the new node. Otherwise, set the next reference of the current tail to the new node and update the tail reference to the new node. Finally, increment the size variable.**

_Explanation:_ `Add` method that creates new `Node` that has parameters `element, null, tail`. If its `size == 0` which means it is empty, it sets head and tail to newNode. Otherwise it tails to the new mode and updates it. Finally it increments size variable. 
```
public boolean add(E element) {
        Node newNode = new Node(element, null, tail);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }
```
**7. Implement the get(int index) method by traversing the list from the head (or tail, depending on which is closer to the specified index) and returning the element at the specified index.**

_Explanation:_ Method `get` that gets one element. Returns current element that stopped
```
public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }
```
**8. Implement the remove(int index) method by first traversing the list to the node at the specified index. Then, update the next and previous references of the surrounding nodes to remove the node from the list, and decrement the size variable.**

_Explanation:_ A  method called `remove`. First it travers the list in specified index. After that it updated data variables that are connected with next and previous references.
```
public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E removedElement = current.element;
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return removedElement;
    }

```
**9. Implement the size() method by returning the size variable.**

_Explanation:_ A function that returns value of the `size`
```
public int size() {
        return size;
    }

```



## Explanation of the Assignment 3

_Stack Implementation_
[Link for the Stack Implementation in ArrayList](https://github.com/azawhat/assignemnt2/blob/main/src/MyArrayListStack.java)
[Link for the Stack Implementation in LinkedList](https://github.com/azawhat/assignemnt2/blob/main/src/MyLinkedListStack.java)


**1. New class named MyLinkedListStack for the MyLinkedList and MyArrayListStack for the MyArrayList implementation.**

_Explanation:_ Two new class created.
```
public class MyLinkedListStack<T> {}

public class MyArrayListStack<T> {}
```
**2. Import the necessary classes**

_Explanation:_ Imported classes at the top of the files 

**3. Variables for these classes**

_Explanation:_ Adding two variables called `stack`
```
private MyArrayList<T> stack;

private MyLinkedList<T> stack;
```
**4. Constructor for these two classes**

_Explanation:_ Creating two classes that is called `MyArrayListStack` and `MyLinkedListStack`. That are connected with origin file that are called `MyArrayList` and `MyLinkedList` respectively.
```
public MyArrayListStack(){
        stack = new MyArrayList<T>();
    }
    
 public MyLinkedListStack() {
        stack = new MyLinkedList<>();
    }
```
**5. Push method .**

_Explanation:_ Push method that adds an element to the top of the stack, it looks same in two classes. 
```
public void push(T element){
        stack.add(element);
    }
```
**6. Pop method .**

_Explanation:_ Pop method that removes and returns the top element of the stack
```
/* In LinkedList */
public T pop(){
        if (isEmpty())  {
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }
    
/* In ArrayList */

public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() -1);
    }
```
**7. Peek method .**

_Explanation:_ Peek method that returns the top element of the stack without removing
```
/* ArrayList */
public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
    
/* LinkedList */

public T peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(0);
    }
```
**8. isEmpty method .**

_Explanation:_ isEmpty method that returns true if the stack is empty or false if it is not. Looks same for both files.
```
public boolean isEmpty(){
        return stack.isEmpty();
    }
```
**9. Size method .**

_Explanation:_ Size method that returns the number of elements in the stack using the size method. Looks same for both classes
```
public int size(){
        return stack.size();
    }
```


_Queue Implementation_
[Link for the Queue Implementation in ArrayList](https://github.com/azawhat/assignemnt2/blob/main/src/MyArrayListQueue.java)
[Link for the Queue Implementation in LinkedList](https://github.com/azawhat/assignemnt2/blob/main/src/MyLinkedListQueue.java)


**1. New class named MyLinkedListQueue for the MyLinkedList and MyArrayListQueue for the MyArrayList implementation.**

_Explanation:_ 
```
public class MyArrayListQueue<E> {}

public class MyLinkedListQueue<E> {}
```
**2. Import the necessary classes**

_Explanation:_ Imported classes at the top of the files 


**3. Variables for these classes.**

_Explanation:_  Adding two variables called `queue`
```
private MyArrayList<E> queue;

private MyLinkedList<E> queue;
```
**4. Constructor for these two classes.**

_Explanation:_ Creating two classes that is called `MyArrayListQueue` and `MyLinkedListQueue`. That are connected with origin file that are called `MyArrayList` and `MyLinkedList` respectively.
```
public MyArrayListQueue(){
        queue = new MyArrayList<E>();
    }
    
public MyLinkedListQueue(){
        queue = new MyLinkedList<E>();
    }
```
**5. Enqueue method.**

_Explanation:_ Enqueue method that adds an element to the back of the queue. Same for both classes
```
public void enqueue(E element){
        queue.add(element);
    }
```
**6. Dequeue method.**

_Explanation:_ Dequeue method that removes and returns the front element of the queue. Same for both classes.
```
public E dequeue(){
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }
```
**7. Peek method.**

_Explanation:_ Peek method that returns the front element of the queue without removing it. Looks same in both classes.
```
public E peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
```
**8. isEmpty method .**

_Explanation:_ isEmpty method that returns true if the queue is empty or false if it is not. Looks same for both files.
```
public boolean isEmpty(){
        return queue.isEmpty();
    }
```
**9. Size method .**

_Explanation:_ Size method that returns the number of elements in the queue using the size method. Looks same for both classes
```
public int size(){
        return queue.size();
    }
```



