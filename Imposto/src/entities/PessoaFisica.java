package entities;

public class PessoaFisica extends Pessoa {

    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    public PessoaFisica(String nome, Double salarioAnual, Double porcentagem, Double gastoSaude) {
        super(nome, salarioAnual, porcentagem);
        this.gastoSaude = gastoSaude;

    }

    @Override
    public double CalculoImposto() {

        return (getPorcentagem() * getSalarioAnual()) - (gastoSaude * ((50 / 100)));
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "- Pessoa Física - " + "," + "Valor do Imposto: R$: " + CalculoImposto() + "\n";

    }

}
