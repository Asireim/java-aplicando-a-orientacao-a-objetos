package br.com.alura.exercicios.calculavel;

public class Livro implements Calculavel {
    private double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public double calcularPrecoFinal(double desconto) {
        double precoFinal = this.preco - desconto;
        return precoFinal;
    }
}
