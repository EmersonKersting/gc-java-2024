package Aula02.Exercicio05;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String word = scanner.next();

        int split = word.length() / 2;
        System.out.println(word.substring(0, split));

    }
}
