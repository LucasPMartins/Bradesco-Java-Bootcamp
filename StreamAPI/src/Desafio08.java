import java.util.Arrays;
import java.util.List;

public class Desafio08 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .mapToInt(num -> Integer.toString(num)  // Converte o número para String
                        .chars()  // Cria um stream de caracteres
                        .map(c -> c - '0')  // Converte de volta para inteiro (dígitos)
                        .sum())  // Soma os dígitos do número
                .sum();  // Soma todos os resultados

        System.out.println("Soma dos dígitos de todos os números: " + somaDosDigitos);

    }


}
