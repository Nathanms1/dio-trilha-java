import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite seu saldo: ");
        float saldo = scanner.nextFloat();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo de R$" + saldo + " já está disponível para saque." );
        
        
    }
}
