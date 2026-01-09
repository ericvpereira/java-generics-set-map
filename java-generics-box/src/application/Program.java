package application;

import model.entities.Box;

public class Program {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("hello");
        System.out.println("String: " + box.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        System.out.println("Integer: " + integerBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(12.54);
        System.out.println("Double: " + doubleBox.get());
    }
}
