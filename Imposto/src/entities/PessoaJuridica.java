package entities;

public class PessoaJuridica extends Pessoa {

    private Integer numFuncionarios;

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double salarioAnual, Double porcentagem, Integer numFuncionarios) {
        super(nome, salarioAnual, porcentagem);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double CalculoImposto() {

        return (getPorcentagem() * getSalarioAnual());
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "- Pessoa Jurídica - " + "," + "Valor do Imposto: R$: " + CalculoImposto()
                + "\n ";

    }

}
