public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("O título da música é: " + titulo);
        System.out.println("O artista responsável é: " + artista);
        System.out.println("O ano de lançamento é: " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calculaMedia() {
        return (avaliacao/numAvaliacoes);
    }
}
