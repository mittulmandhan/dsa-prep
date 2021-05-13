package com.dsaprep.linear_data_structures.queue;

public class QueueUsingArray_Client {
    public static void main(String[] args) throws Exception {
        QueueUsingArray q = new QueueUsingArray();
        q.dequeue();
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(8);
        q.display();
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        q.display();
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(13);
        q.enqueue(15);
        q.display();
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        System.out.println(q.isEmpty());
        q.enqueue(19);
        q.display();
    }
}
