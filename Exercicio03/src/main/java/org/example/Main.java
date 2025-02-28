package org.example;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaCorrente = new ContaCorrente("Jão Silva", 12345, 2000.00, 1500.00);
        ContaBancaria contaInvestimento = new ContaInvestimento("Maria da goiaba", 67890, 5000.00);
        ContaBancaria contaPoupanca = new ContaPoupanca("Carlos do fusca", 11223, 1500.00);
        ContaBancaria contaInvestimentoAltoRisco = new ContaInvestimentoAltoRisco("Ana Costela", 44556, 10000.00);
        ContaBancaria contaSalario = new ContaSalario("Calleri", 77889, 2000.00, 1000.00, true);


        contaCorrente.exibirInformacoes();
        contaInvestimento.exibirInformacoes();
        contaPoupanca.exibirInformacoes();
        contaInvestimentoAltoRisco.exibirInformacoes();
        contaSalario.exibirInformacoes();


        System.out.println("\nRealizando depósitos e saques:\n");


        contaCorrente.depositar(500.00);
        contaCorrente.exibirInformacoes();


        contaCorrente.sacar(1000.00);
        contaCorrente.exibirInformacoes();


        contaInvestimento.exibirInformacoes();
        contaInvestimento.sacar(1000.00);


        contaPoupanca.sacar(500.00);
        contaPoupanca.exibirInformacoes();


        contaInvestimentoAltoRisco.sacar(9000.00);
        contaInvestimentoAltoRisco.exibirInformacoes();


        contaSalario.sacar(300.00);
        contaSalario.exibirInformacoes();


        contaSalario.sacar(500.00);
        contaSalario.exibirInformacoes();
    }
}
