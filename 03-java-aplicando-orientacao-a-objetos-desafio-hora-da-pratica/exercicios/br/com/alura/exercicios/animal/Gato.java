package br.com.alura.exercicios.animal;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("miau miau miau...");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando móveis...");
    }
}
