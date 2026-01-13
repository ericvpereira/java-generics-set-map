import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(1.0);
        listDouble.add(3.5);

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(4);

        printList(listDouble);

        double resultadoDouble = somarLista(listDouble);
        System.out.println("Soma da lista Double: " + resultadoDouble);

        printList(listInteger);

        System.out.println("Soma da lista: " + somarLista(listInteger));

    }

    public static double somarLista(List<? extends Number> numeros) {
        double soma = 0;
        for (Number numero : numeros) {
            soma += numero.doubleValue();
        }
        return soma;
    }

    public static void printList(List<? extends Number> numeros) {
        for (Number numero : numeros) {
            System.out.print(numero + ", ");
        }
    }
}
