package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 2. Дослідження порядку конструкторів ---");
        Employee b = new Manager("Іван");

        System.out.println("\n--- 3. Дослідження полів та методів ---");
        System.out.println("b.label -> " + b.label);
        System.out.println("Виклик b.describe():");
        b.describe();

        System.out.println("\n--- 2. Спроба присвоїти базовий об'єкт похідному посиланню ---");
    }
}