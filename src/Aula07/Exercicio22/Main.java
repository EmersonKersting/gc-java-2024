package Aula07.Exercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenorDez();
    }
    public static void MenorDez(){
        Scanner sc = new Scanner(System.in);
        try {
            int numeroDigitado;
            System.out.println("Digite um numero ");
            numeroDigitado = sc.nextInt();
            if (numeroDigitado < 10){
                throw new ValorInvalidoException("O numero " + numeroDigitado + " é menor que 10");
            } else {
                System.out.println("O numero " + numeroDigitado + " é maior ou igual a 10");
            }
        } catch (ValorInvalidoException e ){
            System.out.println("Erro " + e.getMessage());
        }

    }
}
