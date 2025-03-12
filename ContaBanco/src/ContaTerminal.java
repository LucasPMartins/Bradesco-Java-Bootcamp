import java.util.Scanner;

public class ContaTerminal {
    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o nome da Agência!");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o seu saldo!");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque!");
    }
}
