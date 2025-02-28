package org.example;

public class ContaInvestimento extends ContaBancaria{


    public ContaInvestimento(String titular, double numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }

    @Override
    public double sacar(double valor) {
        double taxaRetirada = 0.02;
        double valorComTaxa = valor * (1 + taxaRetirada);

        if (valorComTaxa <= getSaldo()) {
            setSaldo(getSaldo() - valorComTaxa);
            System.out.println("\nSaque de R$" + valor + " realizado com sucesso!");
            System.out.println("Taxa de retirada de 2% aplicada. Valor total descontado: R$" + valorComTaxa);
            System.out.println("Saldo restante: R$" + String.format("%.2f", getSaldo()));
        } else {
            System.out.println("Saldo insuficiente para realizar o saque com a taxa de retirada.");
        }
        return this.getSaldo();
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
