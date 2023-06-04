package com.lukman;
import java.util.Scanner;

public class linkedList {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        linkedList l = new linkedList();
        for (int i = 0; i < 5; i++) {
            l.addLast(s.nextInt());
        }
        l.print();
    }
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            next = null;
            this.data=data;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    void print() {
        Node curr = head;
        while (curr != null) {

            System.out.print(curr.data + "->");
            curr = curr.next;
            if (curr==null)
            {
                System.out.println("null");
            }
        }
    }
}
