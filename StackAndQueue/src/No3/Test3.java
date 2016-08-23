package No3;

import java.util.Stack;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-19 0:17. <br/>
 * Update Date Time: <br/>
 */
public class Test3 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.get(0));
        ReverseStack.reverse(stack);
        System.out.println(stack.get(0));
        ReverseStack.show(stack);
    }
}
