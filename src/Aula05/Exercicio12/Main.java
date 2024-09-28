
// GabrielHowes/Emerson Kersting/Joao Trevisan
import java.util.Scanner;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero: ");
        numero4 = scanner.nextInt();
        System.out.println("Digite o quinto numero: ");
        numero5 = scanner.nextInt();

        int[] novo_array = new int[5];
        novo_array[0] = numero1;
        novo_array[1] = numero2;
        novo_array[2] = numero3;
        novo_array[3] = numero4;
        novo_array[4] = numero5;

        int soma = numero1 + numero2 + numero3 + numero4 + numero5;
        int media = soma / 5;
        System.out.println(("A media arredondada e: " + media));


    }
}
