package No1;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-16 0:23. <br/>
 * Update Date Time: <br/>
 */
public class Test1 {
    public static void main(String[] args) {
        GetMinStack stack1=new GetMinStack();
        stack1.push(10);
        stack1.push(8);
        stack1.push(20);
        System.out.println(stack1.getMin());
        System.out.println(stack1.pop());
    }
}
