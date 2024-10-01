package Aula06.Exercicio17;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        var numerosEntrada = new HashSet<Integer>();

        numerosEntrada.add(1);
        numerosEntrada.add(2);
        numerosEntrada.add(2);
        numerosEntrada.add(3);
        numerosEntrada.add(4);
        numerosEntrada.add(4);
        numerosEntrada.add(5);


        System.out.println(numerosEntrada);
    }
}
