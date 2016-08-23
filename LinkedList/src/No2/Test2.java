package No2;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-22 0:19. <br/>
 * Update Date Time: <br/>
 */
public class Test2 {
    public static void main(String[] args) {
        SNode node1 = new SNode(1);
        SNode node2 = new SNode(2);
        SNode node3 = new SNode(3);
        node1.next = node2;
        node2.next = node3;
        System.out.println(node1.value + "-" + node1.next.value + "-" + node1.next.next.value);
        SNode node=SNode.reverseLL(node1);
        System.out.println(node.value + "-" + node.next.value + "-" + node.next.next.value);
    }
}
