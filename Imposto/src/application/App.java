package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculo de Imposto de Renda");

        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.println("Digite o número de pessoas para calculo do IR");
        Integer N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Nome:");
            String nome = sc.next();

            System.out.println("Salário anual: R$");
            Double salarioAnual = sc.nextDouble();

            System.out.println("Digite ( 1 ) para pessoa física e ( 2 ) Para Jurídica ");
            Integer r = sc.nextInt();

            if (r == 2) {
                System.out.println("Qual o número de funcionarios que serão pagos?");
                Integer nfunc = sc.nextInt();
                if (nfunc > 10) {
                    Double porcentagem = 0.14;
                    Pessoa p = (new PessoaJuridica(nome, salarioAnual, porcentagem, nfunc));
                    p.CalculoImposto();
                    list.add(p);

                } else {
                    Double porcentagem = 0.16;
                    Pessoa p = (new PessoaJuridica(nome, salarioAnual, porcentagem, nfunc));
                    p.CalculoImposto();
                    list.add(p);

                }

            } else if (r == 1) {

                System.out.println("Valor gasto com despesas de saúde: ");
                Double gastoSaude = sc.nextDouble();
                if (salarioAnual > 20000) {
                    Double porcentagem = 0.25;
                    Pessoa p = (new PessoaFisica(nome, salarioAnual, porcentagem, gastoSaude));
                    p.CalculoImposto();
                    list.add(p);
                } else {

                    Double porcentagem = 0.15;
                    Pessoa p = (new PessoaFisica(nome, salarioAnual, porcentagem, gastoSaude));
                    p.CalculoImposto();
                    list.add(p);

                }
            }
        }
        System.out.println(list);

        sc.close();
    }
}