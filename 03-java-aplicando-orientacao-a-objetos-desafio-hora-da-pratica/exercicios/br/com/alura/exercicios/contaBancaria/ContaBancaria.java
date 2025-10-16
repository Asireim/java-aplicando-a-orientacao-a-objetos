package br.com.alura.exercicios.contaBancaria;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Não é possível efetuar o saque. Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
