package Aula04.Exercicio10;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Honda", "civic", 2008, 4);
        Moto moto = new Moto("BMW", "GS1200", 2015, "Normal");

        System.out.println("Informaçoes do carro");
        carro.informacoes();
        System.out.println("Informações da moto");
        moto.informacoes();

    }
}
