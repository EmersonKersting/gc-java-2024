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
                    3 - Listar todas as notas:
                    4 - Sair
                    """);
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o nome do aluno? ");
                    nomeAlunos = sc.nextLine();
                    String nome = nomeAlunos;

                    System.out.println("Qual a nota do aluno: ");
                    notasAlunos = sc.nextDouble();
                    sc.nextLine();

                    listaNotas.put(nomeAlunos, notasAlunos);
                    break;
                case 2:
                    System.out.println("Qual aluno deseja verificar?");
                    nomeAlunos = sc.nextLine();
                    if (listaNotas.containsKey(nomeAlunos)) {
                        System.out.println("A nota do aluno " + nomeAlunos + " foi " + listaNotas.get(nomeAlunos));
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("A lista de todas as notas:");
                    System.out.println(listaNotas);
                    break;
                case 4:
                    System.out.println("Consulta finalizada");
                    break;
                default:
                    System.out.println("Insira uma opcao valida");
                    break;
            }


           
        } while (opcao != 4);
        
    }
}
