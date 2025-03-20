import java.util.List;
import java.util.Arrays;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream().filter(Desafio17::isPrimo).toList();

        System.out.println("Lista de números primos: "+ numerosPrimos);

    }

    public static boolean isPrimo(int num){
        if(num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
