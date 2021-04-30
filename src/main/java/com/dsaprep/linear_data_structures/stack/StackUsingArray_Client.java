package com.dsaprep.linear_data_structures.stack;

public class StackUsingArray_Client {
    public static void main(String[] args) throws Exception {
        StackUsingArray myStack = new StackUsingArray(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);
        myStack.push(11);

        myStack.display();
        System.out.println(myStack.pop());
        myStack.push(7);
        myStack.display();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.display();
        System.out.println(myStack.pop());
//        myStack.pop();
//        myStack.display();
    }
}
