package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap();

        System.out.println("====LISTA DE CONTATOS====");
        map.put("Eric", "(11)98786-6558");
        map.put("John", "(11)98384-6219");
        map.put("Jane", "(11)96786-5674");
        map.put("Maria", "(11)93567-7423");
        map.put("Julie", "(11)95567-7458");

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println("==========================");

        System.out.print("Digite um nome para ver o telefone: ");
        String nome = sc.next();

        if (nome.contains(nome)) {
            System.out.println(nome + " = " + map.get(nome));
        } else {
            System.out.println("Contato não encontrado!");
        }

        sc.close();
    }
}
