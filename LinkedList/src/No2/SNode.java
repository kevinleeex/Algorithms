package No2;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-22 0:16. <br/>
 * Update Date Time: <br/>
 */
public class SNode {
    public int value;
    public SNode next;

    public SNode(int value) {
        this.value = value;
    }

    public static SNode reverseLL(SNode node) {
        SNode prev = null;
        SNode next = null;
        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
