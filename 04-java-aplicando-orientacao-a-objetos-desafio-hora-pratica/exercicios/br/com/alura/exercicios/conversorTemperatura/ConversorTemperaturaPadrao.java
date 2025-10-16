package br.com.alura.exercicios.conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double fahrenheit;
    private double celsius;

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return this.celsius;
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        double calcFahrenheit = ((this.celsius * (9.0 / 5.0)) + 32);
        return calcFahrenheit;
    }

    @Override
    public double fahrenheitParaCelsius() {
        double calcCelsius = (((this.fahrenheit - 32) * 5) / 9);
        return calcCelsius;
    }
}
