package org.example;

public class Employee {
    public String label = "базове (Працівник)";

    public Employee(String name) {
        System.out.println("-> [Employee] конструктор базового класу. Ім'я: " + name);
    }
    public void describe() {
        System.out.println("Виконується метод базового класу Employee");
    }
}