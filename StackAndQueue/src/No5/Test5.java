package No5;

import java.util.Stack;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-21 0:23. <br/>
 * Update Date Time: <br/>
 */
public class Test5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.toString());
        SortStack.Sort(stack);
        System.out.println(stack.toString());
    }
}
