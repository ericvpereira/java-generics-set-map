package application;

import model.entities.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 20);
        Pessoa p2 = new Pessoa("Ana", 20);

        System.out.println(p1 == p2); // Comparação de referencia
        System.out.println(p1.equals(p2)); // Comparação de conteudo

        System.out.println("===========================");

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(new Pessoa("Ana", 20));
        pessoas.add(new Pessoa("Ana", 20));

        System.out.println(pessoas.size()); // Tamanho 1 pois ambos são mesmos conteudos.

        System.out.println("===========================");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2); // true, apontam para mesma referencia
        System.out.println(s1 == s3); // false, apontam para referencias diferentes
        System.out.println(s1.equals(s3)); // true, mesmo conteudo.

    }
}
