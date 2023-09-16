package com.bidgelabz.stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(70);
        s.push(30);
        s.push(56);
        s.printElement();
        System.out.println();

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
