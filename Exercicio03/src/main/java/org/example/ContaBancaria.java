package org.example;

abstract class ContaBancaria {
    private String titular;
    private double numeroConta;
    private double saldo;

    public ContaBancaria(String titular, double numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public abstract double sacar(double valor);

    public void exibirInformacoes(){
        System.out.println("\nTitular: " + this.titular);
        System.out.println("Numero Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }

}
