import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, insira o seu nome: ");
        nomeCliente = in.nextLine();
        System.out.println("Por favor, insira o número da sua agência: ");
        agencia = in.nextLine();
        System.out.println("Por favor, insira o número da sua conta: ");
        numero = in.nextInt();
        System.out.println("Por favor, insira o saldo a ser depositado: ");
        saldo = in.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}