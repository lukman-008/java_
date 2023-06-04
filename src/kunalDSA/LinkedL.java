package kunalDSA;

public class LinkedL {
    private Node head;
    private Node tail;
    private int size;

    public LinkedL(int size) {
        this.size = size;
    }
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
    public void Print()
    {
        Node node = head;
        while(node!=null)
        {
            System.out.println(node.val);
            node=node.next;
        }
    }


    class Node{

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }


    }

}
