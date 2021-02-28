package com.dsaprep.linear_data_structures.linked_list;

class SinglyLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // O(1)
    public int getSize() {
        return size;
    }

    // O(1)
    public boolean isEmpty() {
        return getSize() == 0;
    }

    // O(1)
    public void emptyCheck() {
        if (this.size == 0) {
            throw new RuntimeException("LinkedList is Empty.");
        }
    }

    // O(1)
    public void indexOutOfBoundCheck(int idx) {
        if (idx < 0 || idx >= this.size) {
            throw new IndexOutOfBoundsException("LinkedList index out of bound.");
        }
    }

    // O(n)
    public void print() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    // O(1)
    public void addLast(int data) {
        // create a new node
        Node newNode = new Node(data);
        if (this.size >= 1) {
            // attach
            this.tail.next = newNode;
        } else {
            // list is empty
            // initialize head
            this.head = newNode;
        }
        // update tail
        this.tail = newNode;
        // increment size
        this.size++;
    }

    // O(1)
    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);

        if (this.size >= 1) {
            // append newNode at start
            newNode.next = this.head;
        } else {
            // list is empty
            this.tail = newNode;
        }
        // update tail
        this.head = newNode;
        // increment size
        this.size++;
    }

    // O(1)
    public int getFirst() throws RuntimeException {
        emptyCheck();
        return this.head.data;
    }

    // O(1)
    public int getLast() throws RuntimeException {
        emptyCheck();
        return this.tail.data;
    }

    // O(n)
    public int getAt(int idx) throws RuntimeException {
        // throw error if linked list is empty
        emptyCheck();

        // index out of bound
        indexOutOfBoundCheck(idx);

        // Go to (idx)th element iteratively
        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // O(n)
    // If we make it public user will get the access to node object
    // User should get authority to use internal properties of LinkedList
    // we should return only data
    private Node getNodeAt(int idx) throws RuntimeException {
        // throw error if linked list is empty
        emptyCheck();

        // index out of bound
        indexOutOfBoundCheck(idx);

        // Go to (idx)th element iteratively
        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // O(n)
    public void addAt(int data, int idx) {

        if (idx < 0 || idx > this.size) {
            throw new IndexOutOfBoundsException("Cannot insert node at index" + idx);
        }

        if (idx == 0) {
            addFirst(data);
        } else if (idx == this.size) {
            addLast(data);
        } else {
            // create new node
            Node newNode = new Node(data);
            // get the prefix node
            Node before = getNodeAt(idx - 1);
            // get the suffix node
            Node after = before.next;

            // attach
            before.next = newNode;
            newNode.next = after;

            // increment size
            this.size++;
        }
    }

    // O(1)
    public int removeFirst() {
        emptyCheck();

        int removed = this.head.data;

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            this.head = this.head.next;
            this.size--;
        }

        return removed;
    }

    // O(1)
    public int removeLast() {
        emptyCheck();
        int removed = this.tail.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            this.tail = getNodeAt(size - 2);
            this.tail.next = null;
            this.size--;
        }
        return removed;
    }

    // O(n)
    public int removeAt(int idx) {
        emptyCheck();
        indexOutOfBoundCheck(idx);

        int removed = getAt(idx);

        if (idx == 0) {
            removeFirst();
        } else if (idx == this.size - 1) {
            removeLast();
        } else {
            Node before = getNodeAt(idx - 1);
            before.next = before.next.next;
        }
        return removed;
    }

    // O(1)
    private void swap(Node node1, Node node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    // O(n*(n/2)^2)
    public void reverseData() {
        int left = 0;
        int right = this.size-1;
        Node leftNode = getNodeAt(left);

        while (left < right) {
            Node rightNode = getNodeAt(right);
            swap(leftNode, rightNode);
            leftNode = leftNode.next;
            left++;
            right--;
        }
    }

    // O(n)
    public void reversePointers() {
        Node prev = null;
        Node curr = this.head;

        while(curr != null) {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
    }

    // O(n/2)
    public int findMid() {
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

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