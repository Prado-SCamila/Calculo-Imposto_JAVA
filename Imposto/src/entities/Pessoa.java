package entities;

public abstract class Pessoa {

    private String nome;

    private Double salarioAnual;

    private Double porcentagem;

    public String getNome() {
        return nome;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(Double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, Double porcentagem, Double salarioAnual) {
        super();
        this.nome = nome;
        this.porcentagem = porcentagem;
        this.salarioAnual = salarioAnual;

    }

    public abstract double CalculoImposto();

}
