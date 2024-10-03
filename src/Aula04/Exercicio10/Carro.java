package Aula04.Exercicio10;

public class Carro extends Veiculo {
    int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }
    public void informacoes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Numero de Portas: " + numeroDePortas);
        System.out.println("Marca: " + getMarca());
    }
}

