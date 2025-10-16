package br.com.alura.exercicios.vendavel;

public interface Vendavel {
    double calculaPrecoTotal();
    double calculaImposto(double valorImposto);
    double calculaDesconto(double valorDesconto);
}
