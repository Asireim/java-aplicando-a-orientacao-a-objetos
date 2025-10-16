package br.com.alura.exercicios.carro;

public class ModeloCarro extends Carro {
    private String carroceria;
    private String tipoMotor;
    private boolean cambioAutomatico;
    private int qtdPassageiros;

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getCarroceria() {
        return this.carroceria;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setCambioAutomatico(boolean isCambioAutomatico) {
        this.cambioAutomatico = isCambioAutomatico;
    }

    public void isCambioAutomatico() {
        if (this.cambioAutomatico) {
            System.out.println("O modelo possui câmbio automático.");
        } else {
            System.out.println("O modelo não possui câmbio automático.");
        }
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPassageiros() {
        return this.qtdPassageiros;
    }
}
