package Aula03.Exercicio08;

public class Carro extends Veiculos{
    private static final double custoPorKm = 0.20;

    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);

    }

    @Override
    public double calcularCustoDaViagem(int distancia){
        return distancia * custoPorKm;

    }
}
