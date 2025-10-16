package br.com.alura.exercicios.contaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 10;

    public void cobrarTarifaMensal() {
        double porcentagem = (super.saldo * (this.tarifaMensal / 100));
        super.saldo -= porcentagem;
    }
}
