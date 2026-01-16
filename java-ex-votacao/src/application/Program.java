package application;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();

        Map<String, Integer> map = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                int value = Integer.parseInt(fields[1]);

                map.put(name, map.getOrDefault(name, 0) + value);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
