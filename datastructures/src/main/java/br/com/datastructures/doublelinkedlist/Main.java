package br.com.datastructures.doublelinkedlist;

import br.com.datastructures.common.Employee;

public class Main {

    public static void main(String[] args) {
        var janeJones = new Employee(1, "Jane", "Jones");
        var johnDoe = new Employee(2, "John", "Doe");
        var marySmith = new Employee(3, "Mary", "Smith");
        var mikeWilson = new Employee(4, "Mike", "Wilson");

        var list = new DoubleLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        var billEnd = new Employee(5, "Bill", "End");
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

    }
}
