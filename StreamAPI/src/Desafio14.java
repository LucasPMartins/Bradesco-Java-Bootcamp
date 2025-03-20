import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(12, 22, 32, 4, 52, 6, 72, 8, 92, 10, 52, 4, 4);

        Optional<Integer> maiorPrimo = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .filter(Desafio14::isPrimo).findFirst();

        maiorPrimo.ifPresentOrElse(
                primo -> System.out.println("Maior número primo: " + primo),
                () -> System.out.println("Nenhum número primo encontrado.")
        );
    }
    public static boolean isPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
