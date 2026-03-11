import java.util.Scanner;

public class SomarDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.print("Digite o primeiro número: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma é: " + soma);

        sc.close();
    }
}