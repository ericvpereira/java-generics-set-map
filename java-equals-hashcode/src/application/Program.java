package application;

import model.entities.Produto;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Produto p1 = new Produto(1, "Notebook");
        Produto p2 = new Produto(1, "Notebook");

        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true

        Set<Produto> produtos = new HashSet<>();
        produtos.add(p1);
        produtos.add(p2);

        System.out.println("Tamanho do Set: " + produtos.size()); // 2, pois hashcode não foi sobrescrito.

    }
}
