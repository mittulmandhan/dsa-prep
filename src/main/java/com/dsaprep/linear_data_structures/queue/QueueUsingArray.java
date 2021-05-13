package com.dsaprep.linear_data_structures.queue;

public class QueueUsingArray {

    private final int CAPACITY;
    private int size;
    private int front;
    private int rear;
    private int[] queue;

    public QueueUsingArray() {
        this(10);
    }

    public QueueUsingArray(int capacity) {
        this.queue = new int[capacity];
        this.CAPACITY = capacity;
        this.size = 0;
        this.front = this.rear = -1;
    }

    // adds element at rear end
    // O(1)
    public void enqueue(int data) {
        if(this.size == this.CAPACITY || this.CAPACITY == 0) {
            return;
        }
        if(rear == -1) {
            this.rear = (this.rear + 1) % this.CAPACITY;
            this.front = (this.front + 1) % this.CAPACITY;
            size++;
            queue[this.rear] = data;
            return;
        }
        this.rear = (this.rear + 1) % this.CAPACITY;
        size++;
        queue[this.rear] = data;
        return;
    }

    // removes element from front
    // O(1)
    public int dequeue() throws Exception {
        if(size == 0) {
//            throw new Exception("queue is empty!");
            return Integer.MIN_VALUE;
        }
        int res = queue[front];
        this.front = (this.front + 1) % this.CAPACITY;
        size--;
        return res;
    }

    // displays all the elements in the queue
    // O(n)
    public void display() {
        if(size < 1) {
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front; i <= rear; i++) {
            System.out.print(queue[i] + ", ");
        }
        System.out.println();
    }

    // get the capacity of the queue
    // O(1)
    public int getCapacity() {
        return this.CAPACITY;
    }

    // get the size of the queue
    // O(1)
    public int getSize() {
        return this.size;
    }

    // know queue is empty or not
    // O(1)
    public boolean isEmpty() {
        return this.size == 0;
    }
}
