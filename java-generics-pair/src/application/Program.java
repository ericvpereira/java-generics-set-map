package application;

import model.entities.services.OrderedPairService;
import model.entities.services.Pair;

public class Program {

    public static void main(String[] args) {
        Pair<String, Integer> p1 =
                new OrderedPairService<String, Integer>("Eric", 27);
        Pair<String, String> p2 =
                new OrderedPairService<String, String>("hello", "world");

        System.out.println(p1 + "\n" + p2);
    }
}
