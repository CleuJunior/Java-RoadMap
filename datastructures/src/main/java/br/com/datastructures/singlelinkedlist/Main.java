package br.com.datastructures.singlelinkedlist;

import br.com.datastructures.common.Employee;

public class Main {

    public static void main(String[] args) {
        var john = new Employee(1, "John", "Doe");
        var jane = new Employee(2, "Jane", "Doe");
        var marry  = new Employee(3, "Marry", "Smith");
        var mick = new Employee(4, "Mick", "Wilson");

        var singleLinkedList = new SingleLinkedList();

        System.out.println(singleLinkedList.isEmpty());

        singleLinkedList.addToFront(john);
        singleLinkedList.addToFront(jane);
        singleLinkedList.addToFront(marry);
        singleLinkedList.addToFront(mick);

        singleLinkedList.printList();

        System.out.println();
        System.out.println(singleLinkedList.isEmpty());
        System.out.println(singleLinkedList.getSize());

        singleLinkedList.removeFront();
        singleLinkedList.printList();
        System.out.println();
        System.out.println(singleLinkedList.getSize());

    }
}
