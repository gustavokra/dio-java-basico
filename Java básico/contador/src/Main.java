import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = scan.nextInt();

        contar(primeiroNumero, segundoNumero);

    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        verificarNumeros(primeiroNumero, segundoNumero);
        int contagem = segundoNumero - primeiroNumero;

        for (int i = 0; i < contagem; i++) {
            System.out.println(i + 1);
        }
    }

    static void verificarNumeros(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            System.out.println("Primeiro número nao pode ser maior que o ultimo número");
            throw new ParametrosInvalidosException();
        }
    }

}