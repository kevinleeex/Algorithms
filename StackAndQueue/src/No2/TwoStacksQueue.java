package No2;

import java.util.Stack;

/**
 * Description: This is the queue consisted of two stacks<br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-17 0:11. <br/>
 * Update Date Time: <br/>
 */
public class TwoStacksQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStacksQueue() {
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }

    public void add(int number) {
        stackPush.push(number);
    }

    public int poll() {

        return check().pop();
    }

    public int peek() {

        return check().peek();
    }

    private Stack<Integer> check() {
        if (stackPush.isEmpty() && stackPop.isEmpty())
            throw new RuntimeException("Queue is empty!");
        else if (stackPop.isEmpty()) {//While stackPop is not empty, you can't push elements into it, or the order will go wrong.
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop;
    }
}
