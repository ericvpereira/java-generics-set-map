package application;

import model.entities.services.PrintService;

public class Program {
    public static void main(String[] args) {

        PrintService<String> psString = new PrintService<>();
        psString.addValue("Eric");
        psString.addValue("Ana");
        psString.addValue("João");

        psString.print();
        System.out.println("First: " + psString.first());

        System.out.println();

        PrintService<Integer> psInteger = new PrintService<>();
        psInteger.addValue(27);
        psInteger.addValue(30);
        psInteger.addValue(18);

        psInteger.print();
        System.out.println("First: " + psInteger.first());

        System.out.println();

        PrintService<Double> psDouble = new PrintService<>();
        psDouble.addValue(1.72);
        psDouble.addValue(1.80);

        psDouble.print();
        System.out.println("First: " + psDouble.first());
    }
}
