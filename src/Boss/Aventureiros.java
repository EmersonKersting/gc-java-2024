package Boss;

public class Aventureiros {
     private String nome;
     private int idade;
     private Classes classes;
     private double salario;
     private int notaDesempenho;

    public Aventureiros(String nome, int idade, Classes classes, double salario, int notaDesempenho) {
        this.nome = nome;
        this.idade = idade;
        this.classes = classes;
        this.salario = salario;
        this.notaDesempenho = notaDesempenho;
    }

    @Override
    public String toString() {
        return "Aventureiros{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", classes=" + classes +
                ", salario=" + salario +
                ", notaDesempenho=" + notaDesempenho +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotaDesempenho() {
        return notaDesempenho;
    }

    public void setNotaDesempenho(int notaDesempenho) {
        this.notaDesempenho = notaDesempenho;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
