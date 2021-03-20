package MockTest.App;

import MockTest.App.Implementations.Queue.LinkedQueue;
import MockTest.App.Implementations.Stack.ArrayStack;
import MockTest.App.Implementations.Stack.LinkedStack;
import MockTest.App.Interfases.Queue;
import MockTest.App.Interfases.Stack;

import java.io.FileNotFoundException;

/**
 * @author frenzy
 *
 * Main function,
 */

public class Main {
    public static void main(String[] args) throws Throwable /*, EmptyQueueException REMOVE THIS COMMENT*/{

        /*Create your processing system here and run it using the run() method you created*/

        // Testy
        Stack<Integer> stacky = new LinkedStack<>();
        stacky.push(0);
        stacky.push(4);
        stacky.push(9);
        stacky.push(1);
        stacky.push(12);

        Stack<Integer> stackity = new ArrayStack<>();
        stackity.push(2);
        stackity.push(32);
        stackity.push(12);
        stackity.push(99);
        stackity.push(9);

//        System.out.println(stackity.pop());
        System.out.println(stackity.pop());

        Queue<String> nigga = new LinkedQueue<>();
        nigga.enqueue("yeh");
        nigga.enqueue("boi");
        nigga.enqueue("hehe");
        System.out.println(nigga.dequeue());



    }

}
