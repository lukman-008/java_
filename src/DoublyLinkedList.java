import java.util.Scanner;

public class DoublyLinkedList {
    Node head;
    Node last;
    static class Node
    {
        Node prev;
        Node next;
        int data;
        Node(int data)
        {
            this.data = data;
            prev = null;
            next = null;

        }
    }
    void addFirst(int data)
    {
        Node newNode = new Node(data);
        if (head==null)
        {
            head=newNode;
            last=newNode;
        }
        else
        {
            Node curr=head;
            while (head.prev!=null)

             curr.next=head;
             head=curr;
        }

    }
   void addLast(int data)
   {
       Node newNode = new Node(data);
       if (head==null)
       {
            head = newNode;
            last = newNode;
       }
       else {
           Node curr = last;
           while (curr.next != null) {
               curr = curr.next;
           }
           curr.next = newNode;
           newNode.prev = curr;
           last = newNode;
       }
   }
   void printFirst()
   {
       System.out.println("from first");
       Node curr=head;
       while (curr!=null)
       {
           System.out.print(curr.data+" ");
           curr=curr.next;
       }
       System.out.println();

   }
   void printLast()
   {
       System.out.println("from last");
       Node curr = last;
       while (curr!=null)
       {
           System.out.print(curr.data+" ");
           curr=curr.prev;
       }
   }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DoublyLinkedList d =new DoublyLinkedList();
        for (int i = 0; i <5; i++) {
            d.addLast(s.nextInt());
        }

            d.printFirst();
        d.printLast();

    }
}
