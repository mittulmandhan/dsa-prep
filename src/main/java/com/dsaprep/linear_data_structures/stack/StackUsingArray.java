package com.dsaprep.linear_data_structures.stack;

import ch.qos.logback.core.net.SyslogOutputStream;

public class StackUsingArray {
    private int maxSize;
    private int[] stack;
    private int top;
    public static final int DEFAULT_CAPACITY = 10;

    public StackUsingArray() {
        this(DEFAULT_CAPACITY);
    }

    public StackUsingArray(int capacity) {
        this.maxSize = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // O(1)
    public void push(int data) {
        if(this.top == maxSize - 1) {
            return;
        }
        this.stack[++this.top] = data;
    }

    // O(n)
    public void display() throws Exception {
        if(this.top == -1) {
            throw new Exception("No element in stack to display");
        }
        for(int i = this.top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // O(1)
    public int pop() throws Exception {
        if(this.top == -1) {
            throw new Exception("No element in stack to pop");
        }
        return stack[this.top--];
    }

    // O(1)
    public int top() throws Exception {
        if(this.top == -1) {
            throw new Exception("No element in stack to show");
        }
        return stack[this.top];
    }

    // O(1)
    public boolean isEmpty() {
        return (this.top == -1) ? true : false;
    }

    // O(1)
    public int getSize() {
        return this.top + 1;
    }

    // O(1)
    public int getMaxSize() {
        return this.maxSize;
    }

}
