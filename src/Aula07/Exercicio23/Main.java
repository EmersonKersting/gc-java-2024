package Aula07.Exercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiro, segundo;
        try {
            System.out.println("Digite o primeiro numero:");
            primeiro = sc.nextInt();
            System.out.println("Digite o segundo numero:");
            segundo = sc.nextInt();
            System.out.println("O resultado da divisão é " + dividir(primeiro, segundo));
        } catch (ArithmeticException e){
            System.out.println("Erro " + e.getMessage());
        }
    }

    public static Double dividir (int primeiro, int segundo) {
        if (segundo == 0){
            throw new ArithmeticException("Não é possivel dividor por 0");
        } else {
            return (double) (primeiro / segundo);
        }
    }
}
