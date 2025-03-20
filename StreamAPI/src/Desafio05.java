import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaioresQue5 = numeros.stream().filter(n -> n > 5).collect(Collectors.toList());
        int soma = numerosMaioresQue5.stream().reduce(0, (n1, n2) -> n1 + n2);
        double media = soma / numerosMaioresQue5.stream().count();

        System.out.println("Média dos números maiores que 5 na lista: "+ media);
    }

}
