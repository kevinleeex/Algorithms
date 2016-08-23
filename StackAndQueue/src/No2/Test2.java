package No2;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-17 0:55. <br/>
 * Update Date Time: <br/>
 */
public class Test2 {
    public static void main(String[] args) {
        TwoStacksQueue queue=new TwoStacksQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("peek:"+queue.peek());//Expectation:1
        System.out.println(queue.poll());
        System.out.println("peek:"+queue.peek());//Expectation:2
    }
}
