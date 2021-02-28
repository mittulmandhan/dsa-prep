package com.dsaprep.linear_data_structures.linked_list;

public class SinglyLinkedList_Client {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addLast(7);
        ll.addFirst(10);
        ll.addLast(5);
        ll.addLast(15);
        ll.print();
        System.out.println("mid is " + ll.findMid());
        ll.addAt(20, 2);
        ll.print();
        ll.reverseData();
//        System.out.println("removed " + ll.removeAt(2));
//        System.out.println("removed " + ll.removeLast());
        ll.print();
        ll.reversePointers();
        ll.print();
        System.out.println("mid is " + ll.findMid());
        System.out.println("first element is " + ll.getFirst());
        System.out.println("element at index 1 is " + ll.getAt(1));
    }
}
