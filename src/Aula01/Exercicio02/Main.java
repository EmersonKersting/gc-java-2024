package Aula01.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numeroDois = scanner.nextInt();
        int resultado = numeroUm + numeroDois;

        System.out.println("O resultado da some é: " + resultado);


    }
}
