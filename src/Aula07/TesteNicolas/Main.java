package Aula07.TesteNicolas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean EncerrarWhile = false;

        while (!EncerrarWhile) {
            try {
                System.out.println("Insira um número para calcular a raiz quadrada:");
                double raizQuadrada = scanner.nextDouble();

                if (raizQuadrada < 0) {
                    throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
                }
                double raizada = Math.sqrt(raizQuadrada);
                System.out.println("A raiz quadrada de " + raizQuadrada + " é: " + raizada);
                EncerrarWhile = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Você não inseriu um número válido.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Nicolas é gostoso");
            }
        }


        scanner.close();
    }
}
