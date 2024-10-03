package Aula06.Exercicio18;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        var nomeEstudantes = new HashSet<String>();

        nomeEstudantes.add("Emerson");
        nomeEstudantes.add("João");
        nomeEstudantes.add("Gustavo");
        nomeEstudantes.add("Gabriel");
        nomeEstudantes.add("Fernanda");

        System.out.println("Qual nome esta procurando?");
        nome = sc.next();
        if (nomeEstudantes.contains(nome)){
            System.out.println("O nome " + nome + " esta na lista.");
        } else {
            System.out.println("O nome " + nome + " não esta na lista");
        }

    }
}
