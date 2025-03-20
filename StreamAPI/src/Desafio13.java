import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int intervalo1 = 1;
        int intervalo2 = 5;

        List<Integer> numerosNoIntervalo = numeros.stream().filter(n -> n >= intervalo1 && n <= intervalo2).sorted(Comparator.naturalOrder()).toList();

        System.out.println("Números da lista no intervalo ["+intervalo1+","+intervalo2+"]: "+numerosNoIntervalo);
    }
}
