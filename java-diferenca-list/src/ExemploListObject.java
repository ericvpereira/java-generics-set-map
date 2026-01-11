import java.util.ArrayList;
import java.util.List;

public class ExemploListObject {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        list.add("Eric");
        list.add(27);
        list.add(1.72);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
/*Uma lista que aceita apenas Object (ou subclasses convertidas para Object).
        List<String> NÃO é um List<Object>.
        Uso típico
        APIs antigas
        Quando você precisa misturar tipos
        Pouco recomendado com Generics modernos */