package com.dsaprep.linear_data_structures.linked_list;

public class LL_As_Queue {
    private SinglyLinkedList queue;

    LL_As_Queue() {
        this.queue = new SinglyLinkedList();
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public int size() {
        return this.queue.getSize();
    }

    public void enqueue(int data) {
        this.queue.addLast(data);
    }

    public int dequeue() {
        return this.queue.removeFirst();
    }

    public int front() {
        return  this.queue.getFirst();
    }

    public void print() {
        this.queue.print();
    }
}
