package Aula03.Exercicio08;

public class Moto extends Veiculos {
    private static final double custoPorKm = 0.15;

    public Moto (String marca, String modelo, int ano){
        super(marca, modelo, ano);

    }

    @Override
    public double calcularCustoDaViagem(int distancia){
        return distancia * custoPorKm;

    }
}

