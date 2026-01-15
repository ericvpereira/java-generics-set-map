import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Ana", "Maria", "Pedro");

        Set<String> nomeSet = new HashSet<>(nomes);
        System.out.println(nomeSet);

    }
}