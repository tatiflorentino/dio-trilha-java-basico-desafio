import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da Agencia !");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o numero da Conta");
        String Conta = scanner.next();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu Saldo");
        String Saldo= scanner.next();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Conta + ", e seu saldo " + Saldo);
        System.out.println("Já está disponível para saque. ");

    }
}
