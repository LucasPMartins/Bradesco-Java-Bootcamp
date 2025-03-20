import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNumero = numeros.stream().max(Comparator.naturalOrder()).get();

        int segundoMaior = new ArrayList<Integer>(numeros).stream().filter(n -> n != maiorNumero).max(Comparator.naturalOrder()).get();

        System.out.println("Segundo maior número: " + segundoMaior);

//        Outra resolução:
//        int segundoMaior = numeros.stream()
//                .sorted(Comparator.reverseOrder())  // Ordena de forma decrescente
//                .distinct()  // Remove números duplicados
//                .skip(1)  // Pula o maior número
//                .findFirst()  // Pega o primeiro elemento (que será o segundo maior)
//                .get();
    }
}
