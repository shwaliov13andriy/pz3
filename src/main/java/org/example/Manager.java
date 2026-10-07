package org.example;

public class Manager extends Employee {
    public String label = "похідне (Менеджер)";

    public Manager(String name) {
        super(name);
        System.out.println("-> [Manager] конструктор похідного класу");
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Виконується метод похідного класу Manager");
    }
}