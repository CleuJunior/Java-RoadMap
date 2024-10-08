package br.com.datastructures.doublelinkedlist;

import br.com.datastructures.common.Employee;

public class Node {
    private Employee employee;
    private Node next;
    private Node previous;

    public Node(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
