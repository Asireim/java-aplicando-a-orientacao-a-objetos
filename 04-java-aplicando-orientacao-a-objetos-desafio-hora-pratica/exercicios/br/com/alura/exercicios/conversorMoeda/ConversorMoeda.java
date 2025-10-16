package br.com.alura.exercicios.conversorMoeda;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valorDolar;

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public double getValorDolar() {
        return this.valorDolar;
    }

    @Override
    public double converterDolarParaReal(double valorEmReais) {
        double conversao = this.valorDolar * valorEmReais;
        return conversao;
    }
}
