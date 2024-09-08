package br.com.datastructures.vector;

import br.com.datastructures.common.Employee;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListImpl {

    public static void main(String[] args) {
        var employeeList = new Vector<Employee>();

        employeeList.add(new Employee(1, "John", "Doe"));
        employeeList.add(new Employee(2, "Jane", "Doe"));
        employeeList.add(new Employee(3, "Marry", "Smith"));
        employeeList.add(new Employee(4, "Mick", "Wilson"));

        employeeList.forEach(System.out::println);

        System.out.println();

        System.out.println("Getting employee 3");
        System.out.println(employeeList.get(2));

        System.out.println();

        employeeList.set(2, new Employee(3, "Update", "Employee 3"));
        System.out.println(employeeList.get(2));

        // Adding in specific position

        employeeList.add(1, new Employee(5, "Adding", "Specific Position"));

        System.out.println();
        employeeList.forEach(System.out::println);

        var employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        System.out.println();
        System.out.println("Print employee from array");

        for (var employee : employeeArray) {
            System.out.println(employee);
        }

        var cotains = employeeList.contains(new Employee(1, "John", "Doe"));

        System.out.println();
        System.out.println("Cotains employee: " + cotains);
        System.out.println("Check index: " + employeeList.indexOf(new Employee(4, "Mick", "Wilson")));

        employeeList.remove(3);

        System.out.println();
        employeeList.forEach(System.out::println);
    }
}


