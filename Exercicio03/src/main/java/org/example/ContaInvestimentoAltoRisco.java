package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{
    public ContaInvestimentoAltoRisco(String titular, double numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }

    @Override
    public double sacar(double valor) {
        double taxaRetirada = 0.05;
        double valorComTaxa = valor * (1 + taxaRetirada);

        if (getSaldo() >= 10000) {
            if (getSaldo() >= valorComTaxa) {
                if (valor > 0) {
                    setSaldo(getSaldo() - valorComTaxa);

                    System.out.println("\nSaque de R$" + valor + " realizado com sucesso!");
                    System.out.println("Taxa de retirada de 5% aplicada. Valor total descontado: R$" + valorComTaxa);
                    System.out.println("Saldo restante: R$" + String.format("%.2f", getSaldo()));
                } else {
                    System.out.println("Valor inválido. O valor do saque deve ser positivo.");
                }
            } else {
                System.out.println("Saldo insuficiente para realizar o saque com a taxa de retirada.");
            }
        } else {
            System.out.println("Saldo insuficiente para realizar o saque. O saldo mínimo deve ser de R$10.000.");
        }

        return getSaldo();
    }


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
