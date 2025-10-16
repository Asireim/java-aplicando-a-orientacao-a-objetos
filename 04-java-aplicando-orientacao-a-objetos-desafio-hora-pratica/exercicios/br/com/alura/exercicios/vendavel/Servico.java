package br.com.alura.exercicios.vendavel;

public class Servico implements Vendavel {
    private int vezesContratado;
    private double preco;

    public void setVezesContratado(int vezesContratado) {
        this.vezesContratado = vezesContratado;
    }

    public int getVezesContratado() {
        return this.vezesContratado;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public double calculaPrecoTotal() {
        double precoTotal = (this.preco * this.vezesContratado);
        return precoTotal;
    }

    @Override
    public double calculaImposto(double valorImposto) {
        double imposto = (this.calculaPrecoTotal() + valorImposto);
        return imposto;
    }

    @Override
    public double calculaDesconto(double valorDesconto) {
        double desconto = (this.calculaPrecoTotal() - valorDesconto);
        return desconto;
    }
}
