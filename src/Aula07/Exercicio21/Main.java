package Aula07.Exercicio21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numeroInteiro();

    }
    public static void numeroInteiro(){
        Scanner sc = new Scanner(System.in);
        try {
            int inteiroDigitado;
            System.out.println("Digite um numero inteiro");
            inteiroDigitado = sc.nextInt();
            if (inteiroDigitado < 0){
               throw new IllegalArgumentException("O numero " + inteiroDigitado + " nao é um numero inteiro");
            } else {
                System.out.println("O numero " + inteiroDigitado + " é um numero inteiro positivo");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

}
