package Aula04.Exercicio10;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a marca do veiculo:");
        String marca = sc.nextLine();
        System.out.println("Qual a modelo do veiculo:");
        String modelo = sc.nextLine();
        System.out.println("Qual o ano do veiculo:");
        int ano = sc.nextInt();
        System.out.println("Quantas portas tem o carro");
        int numeroDePortas = sc.nextInt();
        System.out.println("Tipo de guidão ");
        String tipoDeGuidao = sc.nextLine();
        Carro carro = new Carro(marca, modelo, ano, numeroDePortas);
        Moto moto = new Moto(marca, modelo, ano, tipoDeGuidao);

        carro.informacoes();
        moto.informacoes();

    }
}
