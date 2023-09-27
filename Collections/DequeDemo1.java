package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo1 {
    public static void main(String[] args) {
        // create an empty array deque with an initial capacity
        Deque<Integer> deque = new ArrayDeque<Integer>(8);

        // usee the add method to add elements in the deque
        deque.add(15);
        deque.add(10);
        deque.add(13);
        deque.add(90);

        // let us print all thr elemnts available in the queue
        for (Integer number : deque) {
            System.out.println("Number = " + number);
        }

        // getfirst() will retrive element at head of position
        int retval = deque.getFirst();

        System.out.println("Retrieved element is: " + retval);
    }
}
