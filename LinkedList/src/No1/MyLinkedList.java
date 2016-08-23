package No1;

/**
 * Description: A Linked List that enable to remove the last Kth node.<br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-18 7:43. <br/>
 * Update Date Time: <br/>
 */
public class MyLinkedList {
    private Node head;

    public MyLinkedList(int headValue) {
        head=new Node(headValue);
    }

    public void add(int number) {
        Node node = new Node(number);
        if (head == null) {
            System.out.println("Cannot add a new node because head is null!");
        } else {
            node.next = head;
            head = node;
        }
    }

    public void removeLastKthNode(int k) {
        if (head == null || k < 1)
            System.out.println("Failed! Caused by: head node is null or input k < 1");

        Node cur=head;
        while(cur!=null){
            k--;
            cur=cur.next;
        }
        if(k==0)
            head=head.next;

        if(k<0){
            cur=head;
            while(++k!=0){
                cur=cur.next;//when k == 0, that means the next is the node we want to delete.
            }
            cur.next=cur.next.next;
        }
    }

    public void show(){
        if(head==null){
            System.out.println("There is no head node.");
        }
        else{
            Node cur=head;
            StringBuilder strLinkedList=new StringBuilder();
            while (cur!=null){
                strLinkedList.append(cur.value);
                strLinkedList.append("-->");
                cur=cur.next;
            }
            int length=strLinkedList.length();

            String string=strLinkedList.substring(0,length-3);
            System.out.println(string);
        }
    }
}

