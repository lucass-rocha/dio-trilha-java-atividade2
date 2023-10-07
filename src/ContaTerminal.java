import static java.lang.System.out;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da conta!:  ");
            int numeroConta = scanner.nextInt();
            System.out.println("Por favor, digite o número da sua agência!:  ");
            String numeroAgencia = scanner.next();
            System.out.println("Qual é o seu nome?:  ");
            String nomeCliente = scanner.next();
            System.out.println("Qual é o seu saldo?:  ");
            Double saldo = scanner.nextDouble();
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        }

    }
}
