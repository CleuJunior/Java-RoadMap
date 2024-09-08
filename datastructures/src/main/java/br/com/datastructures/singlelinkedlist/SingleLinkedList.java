package br.com.datastructures.singlelinkedlist;

import br.com.datastructures.common.Employee;

public class SingleLinkedList {

    private Node head;
    private int size;

    public void addToFront(Employee employee) {
        var node = new Node(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public Node removeFront() {
        if(isEmpty()) {
            return null;
        }

        var node = head;
        head = head.getNext();
        size--;
        node.setNext(null);
        return node;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        var current = head;
        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.print("null");
    }
}
