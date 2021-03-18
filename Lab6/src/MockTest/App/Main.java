package MockTest.App;

import MockTest.App.Implementations.Stack.ArrayStack;
import MockTest.App.Implementations.Stack.LinkedStack;
import MockTest.App.Interfases.Stack;

import java.io.FileNotFoundException;

/**
 * @author frenzy
 *
 * Main function,
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException /*, EmptyQueueException REMOVE THIS COMMENT*/{

        /*Create your processing system here and run it using the run() method you created*/

        // Testy
        Stack<Integer> stacky = new LinkedStack<>();
        stacky.push(0);
        stacky.push(4);
        stacky.push(9);
        stacky.push(1);
        stacky.push(12);




    }

}
