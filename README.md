# Assignment 2
This is the second assignment of the Algorithms and Data Structure course.


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



