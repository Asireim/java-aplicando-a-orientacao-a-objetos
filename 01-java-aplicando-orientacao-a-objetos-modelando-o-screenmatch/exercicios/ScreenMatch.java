public class ScreenMatch {
    public static void main(String[] args) {
        Filme alice = new Filme();

        alice.setNome("Alice no país das maravilhas");
        alice.setAnoDeLancamento(2010);
        alice.setDuracaoEmMinutos(109);
        alice.setIncluidoNoPlano(true);

        alice.exibeFichaTecnica();

        alice.avalia(5.0);
        alice.avalia(4.9);
        alice.avalia(4.8);

        System.out.println("A média das avaliações é : " + alice.pegaMedia());
    }
}
