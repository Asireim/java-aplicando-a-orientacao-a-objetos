package br.com.alura.exercicios.vendavel;

public class Produto implements Vendavel {
    private int qtdComprada;
    private double preco;

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public int getQtdComprada() {
        return this.qtdComprada;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public double calculaPrecoTotal() {
        double precoTotal = (this.preco * this.qtdComprada);
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
