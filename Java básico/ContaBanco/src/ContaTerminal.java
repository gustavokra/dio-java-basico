import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private static String nomeCliente;
    private static String agencia;
    private static Integer conta;
    private static Double saldo;

    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Scanner scan = new Scanner(System.in).useLocale(locale);

        System.out.println("Digite o seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.println("Digite a sua agência: ");
        agencia = scan.nextLine();
        
        System.out.println("Digite o número da sua conta: ");
        conta = scan.nextInt();
        
        saldo = 500.0;

        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + conta + " e seu saldo " + saldo +
        " já está disponível para saque!");
    }

}
