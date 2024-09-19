package Aula03.Exercicio08;

public abstract class Veiculos {
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculos (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public abstract double calcularCustoDaViagem(int distancia);

}

