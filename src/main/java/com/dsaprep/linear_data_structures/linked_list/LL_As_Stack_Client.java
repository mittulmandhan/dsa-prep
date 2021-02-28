package com.dsaprep.linear_data_structures.linked_list;

public class LL_As_Stack_Client {
    public static void main(String[] args) {
        LL_As_Stack stack = new LL_As_Stack();
        stack.push(10);
        stack.print();
        stack.push(20);
        stack.print();
        stack.push(30);
        stack.print();
        stack.push(40);
        stack.print();
        stack.push(50);
        stack.print();
        System.out.println("pop " + stack.pop());
        stack.print();
        System.out.println("pop " + stack.pop());
        stack.print();
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
