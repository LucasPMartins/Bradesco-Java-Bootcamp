import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multp3e5 = numeros.stream().filter(n -> (n % 3 == 0 || n % 5 == 0)).toList();

        int soma = multp3e5.stream().reduce((n1,n2)-> n1+n2).orElse(0);

        System.out.println("Soma dos números divisíveis por 3 e 5: "+ soma);


    }
}
