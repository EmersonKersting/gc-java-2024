package Aula07.Exercicio24;

import java.util.Scanner;
import static Aula07.Exercicio24.opcoes.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string");
        String string = sc.nextLine();

        System.out.println("""
                ||| Escolha uma opção |||
                1 - Converter String em Inteiro
                2 - Verificar se esta nula ou vazia
                3 - Selecionar um caracter da string
                4 - Verificar se "Java é facil" esta na frase
                5 - Sair
                """);
            int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                ConverterString(string);
                break;
            case 2:
                try {
                    NuloVazio(string);
                } catch (IllegalArgumentException | NullPointerException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("Qual o nome de serie em que 5 jovens javers enfrentam o boss no mundo invertido?/n" +
                            " Stranger Strings ");
                }
                break;
            case 3:
                System.out.println("Qual caractere deseja selecionar?");
                System.out.print("Índicies disponíveis: ");
                for (int i = 0; i < string.length(); i++) {
                    System.out.print(i + " ");
                }

                System.out.print("\nEscolha do índice: ");
                int indice = sc.nextInt();

                PegarCaractere(string, indice);
                break;
            case 4:
                try {
                    VerificarFrase(string);
                } catch (CaldeiraException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                System.out.println("Finalizado");
                break;
                default:
                    System.out.println("Escolha uma opcao valida");

        }
        sc.close();
    }
}
