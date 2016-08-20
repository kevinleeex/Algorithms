package No5;

import java.util.Stack;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-21 0:10. <br/>
 * Update Date Time: <br/>
 */
public class SortStack {
    public static void Sort(Stack<Integer> original) {
        Stack<Integer> sortStack = new Stack<>();
        while (!original.isEmpty()) {
            int cur = original.pop();
            while (!sortStack.isEmpty() && sortStack.peek() < cur) {
                original.push(sortStack.pop());//If current element is larger than the elem in the bottom of sortStack
            }
            sortStack.push(cur);
        }
        while (!sortStack.isEmpty()) {
            original.push(sortStack.pop());
        }
    }
}