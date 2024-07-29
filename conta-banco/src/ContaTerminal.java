import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String conta;
        int agencia;
        String nomeCliente;
        double saldo;

        System.out.println("\t---------------Conta Bancária---------------");
        System.out.println();

        System.out.println("Por favor, digite o número da Agência (1234) !");
        agencia = sc.nextInt();

        System.out.println("Por favor, digite o número da Conta (123-4)!");
        conta = sc.next();

        System.out.println("Digite o nome do titular da conta!");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        saldo = sc.nextDouble();

        System.out.println("\t---------------------------------------------");
        System.out.println();

        System.out.printf("ola %s obrigado por criar uma conta em nosso banco," 
        + "sua agencia é %d, sua conta %s é seu saldo %.2f já está"
        + "disponivel para saque!", nomeCliente, agencia,conta, saldo);


        sc.close();
    }
}
