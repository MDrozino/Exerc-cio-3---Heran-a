package org.example;

public class ContaCorrente extends ContaBancaria{
    private double limite;

    public ContaCorrente(String titular, double numeroConta, double saldo, double limite) {
        super(titular, numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }

    @Override
    public double sacar(double valor) {
        if (valor <= this.getSaldo() + limite) {
            if (valor > getSaldo()) {
                double valorChequeEspecialUsado = valor - getSaldo();
                setSaldo(0);
                limite -= valorChequeEspecialUsado;
            } else {
                setSaldo(getSaldo() - valor);
            }
            System.out.println("\nNovo saldo: " + this.getSaldo());
            System.out.println("Valor sacado: " + valor);
            System.out.println("Seu limite: " + limite);
        }else{
            System.out.println("Saldo insuficiente");
        }
        return this.getSaldo();
    }
}
