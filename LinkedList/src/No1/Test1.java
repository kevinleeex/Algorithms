package No1;

/**
 * Description: Test for MyLinkedList<br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-18 8:52. <br/>
 * Update Date Time: <br/>
 */
public class Test1 {
    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.show();
        linkedList.removeLastKthNode(3);
        System.out.println("Removed last 3rd node!");
        linkedList.show();
    }
}
