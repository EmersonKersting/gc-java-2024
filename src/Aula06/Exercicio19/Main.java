package Aula06.Exercicio19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> listaNotas = new HashMap<>();
        int opcao;
        String nomeAlunos;
        double notasAlunos = 0;
        
        do {
            System.out.println("""
                    1 - Adicionar aluno e nota:                  
                    2 - Consultar nota dos aluno:
                    3 - Sair
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o nome do aluno? ");
                    nomeAlunos = sc.nextLine();
                    sc.next();

                    System.out.println("Qual a nota do aluno: ");
                    notasAlunos = sc.nextDouble();

                    listaNotas.put(nomeAlunos, notasAlunos);
                    break;
                case 2:
                    System.out.println("Qual aluno deseja verificar?");
                    nomeAlunos = sc.nextLine();
                    sc.next();
                    System.out.println("A nota do aluno " + notasAlunos + " foi " + notasAlunos);
                    break;
                case 3:
                    System.out.println("Consulta finalizada");
                    break;
                default:
                    System.out.println("Insira uma opcao valida");
                    break;
            }


           
        } while (opcao != 3);
        
    }
}
