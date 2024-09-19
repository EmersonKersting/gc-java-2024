package Aula03.Exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Ano: ");
        int ano = scanner.nextInt();
        Carro carro = new Carro (marca, modelo, ano);
        Moto moto= new Moto ("Honda", "CB300", 2007);

        System.out.println("Qual a distancia? ");
        int distancia = scanner.nextInt();

        System.out.println("Custo da viagem de carro no modelo " + carro.getModelo() + "e da marca " + carro.getMarca() + " é R$" + carro.calcularCustoDaViagem(distancia) );
        System.out.println("Custo da viagen de moto no modelo " + moto.getModelo() + " da marca " + moto.getMarca() + " é R$" + moto.calcularCustoDaViagem(150));
        scanner.close();
    }
}
