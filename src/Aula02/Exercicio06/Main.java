package Aula02.Exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua comida favorita? ");
        String comidaFavorita = scanner.nextLine();

        String palavraInvertida = "";

        for (int i = comidaFavorita.length() - 1; i >= 0; i--) {
            palavraInvertida += comidaFavorita.charAt(i);
        }

        System.out.println("Sua comida favorita: " + palavraInvertida);
    }
}