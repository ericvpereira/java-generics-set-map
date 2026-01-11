import java.util.Arrays;
import java.util.List;

public class ExemploWildCard {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Eric", "Ana");
        List<Integer> numeros = Arrays.asList(1, 2, 3);

        printList(nomes);
        printList(numeros);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + ", ");
        }
    }
}

/* Você não pode adicionar elementos, pois o tipo é desconhecido.
    Uso típico
    Métodos utilitários
    Leitura de dados
    APIs genéricas */
