package com.dsaprep.linear_data_structures.linked_list;

public class LL_As_Stack {
    private SinglyLinkedList stack;

    LL_As_Stack() {
        this.stack = new SinglyLinkedList();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public int size() {
        return this.stack.getSize();
    }

    public void print() {
        this.stack.print();
    }

    public void push(int data) {
        this.stack.addFirst(data);
    }

    public int pop() {
        return this.stack.removeFirst();
    }

    public int top() {
        return this.stack.getFirst();
    }
}
