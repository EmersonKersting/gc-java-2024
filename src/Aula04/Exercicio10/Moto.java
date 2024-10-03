package Aula04.Exercicio10;

public class Moto extends Veiculo {
    String tipoDeGuidao;

    public Moto(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public void informacoes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Numero de Portas: " + tipoDeGuidao);
        System.out.println("Marca: " + getMarca());
    }
}
