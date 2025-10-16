package br.com.alura.exercicios.calculadoraSalaRetangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private int altura;
    private int largura;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getLargura() {
        return this.altura;
    }

    @Override
    public double calcularArea() {
        int area = (this.altura * this.largura);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        int perimetro = (2 * (this.largura + this.altura));
        return perimetro;
    }
}
