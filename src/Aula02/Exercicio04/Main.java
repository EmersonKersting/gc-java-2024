package Aula02.Exercicio04;

import java.util.Scanner;

public class Main {


    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor final: ");
        int fim = scanner.nextInt();

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (numeroPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
