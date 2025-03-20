import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12);

        boolean todosIguais = numeros.stream().distinct().count() == 1;

        System.out.println("Todos os números da lista são iguais? " + todosIguais);
    }
}
