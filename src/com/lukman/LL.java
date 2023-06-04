package com.lukman;

class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data= data;
            this.next=null;
        }
    }
    //add - first ,last

    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;

    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
       Node curr = head;
        while (curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void pop()
    {
        Node l =head;
        while (l.next.next!=null)
        {
            l=l.next;
        }
        System.out.print(l.next.data+"->");
        l.next=null;
    }
     public void print ()
    {
        Node curr = head;
        if (head==null)
        {
            System.out.println("linkedlist is empty");
        }
        System.out.print(head.next.data+"->");
        while (curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("friend of");
        list.addFirst("lukman");
        list.addFirst("prabhash");
        list.addLast("vishal");
        list.print();
        list.pop();
        list.pop();
        list.pop();

    }

}
