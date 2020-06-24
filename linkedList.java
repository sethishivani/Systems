//Link: https://practice.geeksforgeeks.org/problems/java-collections-set-7-linkedlist/1

import java.io.*;
import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}

class linkedList
{
    public static void main(String[] args)
    {
        int n,d;
        Scanner sc= new Scanner(System.in);
        System.out.print("number of nodes in Linked list:");
        n=sc.nextInt();
        Node head=null,cur=null;
        for(int i=0;i<n;i++)
        {
            System.out.print("data of this node in Linked list:");
            d=sc.nextInt();
            Node ptr=new Node(d);
            if(head==null)
            {
                head=ptr;
                cur=ptr;
            }
            else
            {
                cur.next=ptr;
                cur=ptr;
            }
        }
        //Display
        Node x;
        x=head;
        while(x!=null)
        {
            System.out.print(x.data+" ");
            x=x.next;
        }
    }
}