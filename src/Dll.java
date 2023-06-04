import java.util.Scanner;
public class Dll {
    Node head;
    Node last;
    class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }
      void addLast(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head=newNode;
                last=newNode;
            }
            else {
                Node curr=last;
                while(curr.next!=null)
                {
                    curr=curr.next;
                }
                curr.next=newNode;
                newNode.prev=curr;
                last=newNode;
            }
        }
        void printfirst()
        {
            Node curr=head;
            while (curr!=null)
            {
                System.out.println(curr.data);
                curr=curr.next;
            }
        }
        void printlast()
        {
            Node curr=last;
            while (curr!=null)
            {
                System.out.println(curr.data);
                curr=curr.prev;
            }
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dll d = new Dll();
        for (int i = 0; i < 5; i++) {
            int x = s.nextInt();
            d.addLast(x);
        }
        d.printfirst();
        d.printlast();
    }
}
