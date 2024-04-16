package br.com.datastructures.listimpl;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListImpl {

    public static void main(String[] args) {
        var employeeList = new ArrayList<>();

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

    static class Employee {
        private int id;
        private String firstName;
        private String lastName;

        public Employee(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, firstName, lastName);
        }
    }
}


