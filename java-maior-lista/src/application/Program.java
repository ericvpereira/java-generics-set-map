package application;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(3, 10, 7, 2);
        List<String> nomes = Arrays.asList("Eric", "Ana", "João");

        Integer maiorNumero = max(numeros);
        String maiorNome = max(nomes);

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Maior nome: " + maiorNome);

    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }

        T maior = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(maior) > 0) {
                maior = list.get(i);
            }
        }

        return maior;
    }
}
