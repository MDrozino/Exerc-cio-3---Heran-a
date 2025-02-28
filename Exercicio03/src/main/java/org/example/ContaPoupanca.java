package org.example;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, double numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }

    @Override
    public double sacar(double valor) {
        if (valor > 0) {
            if (valor <= this.getSaldo()) {
                setSaldo(getSaldo() - valor);
                System.out.println("\nNovo saldo: " + this.getSaldo());
                System.out.println("Valor sacado: " + valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Valor inválido...");
        }
        return this.getSaldo();
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
