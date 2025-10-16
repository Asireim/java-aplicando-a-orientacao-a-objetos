public class Aluno {
    private String nome;
    private double notas;
    private int cont;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double nota) {
        this.notas += nota;
        cont++;
    }

    public double calcularMedia() {
        return (notas / cont);
    }
}
