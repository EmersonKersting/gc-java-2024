package Aula07.Exercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiro, segundo;
        System.out.println("Digite o primeiro numero:");
        primeiro = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        segundo = sc.nextInt();
        try {
            if (segundo == 0) {
                throw new ArithmeticException("Nao pode ser divido por 0");
            } else if (primeiro == 5) {
                throw new EmersonException("Nao pode ser divido por 5");
            }
        } catch (ArithmeticException | EmersonException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}

