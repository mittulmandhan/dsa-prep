package com.dsaprep.linear_data_structures.linked_list;

public class LL_As_Queue_Client {
    public static void main(String[] args) {
        LL_As_Queue queue = new LL_As_Queue();
        queue.enqueue(10);
        queue.print();
        queue.enqueue(20);
        queue.print();
        queue.enqueue(30);
        queue.print();
        queue.enqueue(40);
        queue.print();
        queue.enqueue(50);
        queue.print();
        System.out.println("dequeue " + queue.dequeue());
        queue.print();
        System.out.println("dequeue " + queue.dequeue());
        queue.print();
        System.out.println(queue.isEmpty());
        System.out.println(queue.front());
        System.out.println(queue.size());
    }
}
