package application;

import model.entities.Usuario;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Usuario> alunos = new HashSet<>();

        System.out.print("How many students for course A? ");
        lerAlunos(sc, alunos);

        System.out.print("How many students for course B? ");
        lerAlunos(sc, alunos);

        System.out.print("How many students for course C? ");
        lerAlunos(sc, alunos);

        System.out.println("Total students: " + alunos.size());

        sc.close();

    }

    private static void lerAlunos(Scanner sc, Set<Usuario> alunos) {
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            alunos.add(new Usuario(sc.nextInt()));
        }
    }
}
