package org.example;

public class ContaSalario extends ContaCorrente {
    private boolean saqueGratisNoMes;

    public ContaSalario(String titular, double numeroConta, double saldo, double limite, boolean saqueGratisNoMes) {
        super(titular, numeroConta, saldo, limite);
        this.saqueGratisNoMes = saqueGratisNoMes;
    }


    @Override
    public double sacar(double valor) {
        if (saqueGratisNoMes) {
            saqueGratisNoMes = false;
            return super.sacar(valor);

        } else {

            if (valor + 5 <= (getSaldo() + getLimite())) {
                setSaldo(getSaldo() - 5);
                System.out.println("Taxa  administrativa: 5 reais");
                return super.sacar(valor );

            } else {
                return getSaldo();
            }
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}

