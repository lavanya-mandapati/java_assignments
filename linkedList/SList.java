package linkedList;
import java.io.*;
public class SList {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void printList(SList list)
    {
        Node currentNode=list.head;
        while(currentNode!=null)
        {
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println("\n");
    }
    public static void main(String[]args)
    {
        SList s=new SList();
    }
}
