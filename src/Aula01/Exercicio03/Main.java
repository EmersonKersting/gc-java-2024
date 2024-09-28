package Aula01.Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numeroUm = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numeroDois = scanner.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double numeroTres = scanner.nextDouble();


        if (numeroUm > numeroDois && numeroUm > numeroTres) {
            System.out.println("O maior numero é o " + numeroUm);
        } if (numeroUm < numeroDois && numeroUm < numeroTres) {
            System.out.println("O menor numero é o " + numeroUm);
        } if (numeroDois > numeroUm && numeroDois > numeroTres) {
            System.out.println("O maior numero é o " + numeroDois);
        } if (numeroTres > numeroUm && numeroTres > numeroDois) {
            System.out.println("O maior numero é o " + numeroTres);
        } if (numeroTres < numeroUm && numeroTres < numeroDois) {
            System.out.println("O menor numero é o " + numeroTres);
        }

        double mediaAritmetica = (numeroUm + numeroDois + numeroTres) / 3;
        System.out.printf("A media aritmetica é %.2f", mediaAritmetica);
    }
}
