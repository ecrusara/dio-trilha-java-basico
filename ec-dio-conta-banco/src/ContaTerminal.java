import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Número da Agência!");
        int agencia = scanner.nextInt();

        System.out.println("Digite o Número da Conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o Nome do Cliente:");
        String nome = scanner.next();

        System.out.println("Digite o Saldo da Conta:"); 
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo));
    
    }
}
