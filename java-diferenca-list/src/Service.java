import java.util.ArrayList;
import java.util.List;

public class Service<T> {

    private List<T> list = new ArrayList<>();

    public void add(T value) {
        list.add(value);
    }

    public T first() {
        return list.get(0);
    }
}

/* Lista com tipo definido pelo contexto, normalmente em classes ou métodos genéricos.
Uso
Service<String> s1 = new Service<>();
s1.add("Eric");

Service<Integer> s2 = new Service<>();
s2.add(10);
Uso típico
Serviços genéricos
Repositórios
Classes reutilizáveis
 */

/* List<Object> aceita qualquer objeto, mas não é compatível com listas genéricas.
List<?> representa uma lista de tipo desconhecido, usada apenas para leitura.
List<T> é usada em contextos genéricos, permitindo reutilização e segurança de tipos.*/