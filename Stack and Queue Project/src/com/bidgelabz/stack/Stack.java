package com.bidgelabz.stack;

public class Stack {
    Node head;

    public boolean isEmpty(){
        return head==null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if ( isEmpty()){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void printElement (){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Empty");
        }
        int top=head.data;
        head=head.next;
        return top;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Empty");
        }
        return head.data;
    }
}
