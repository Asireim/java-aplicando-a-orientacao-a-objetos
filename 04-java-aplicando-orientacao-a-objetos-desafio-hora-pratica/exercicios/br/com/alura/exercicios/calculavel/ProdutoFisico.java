package br.com.alura.exercicios.calculavel;

public class ProdutoFisico implements Calculavel {
    private double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public double calcularPrecoFinal(double taxa) {
        double precoFinal = this.preco + taxa;
        return precoFinal;
    }
}
