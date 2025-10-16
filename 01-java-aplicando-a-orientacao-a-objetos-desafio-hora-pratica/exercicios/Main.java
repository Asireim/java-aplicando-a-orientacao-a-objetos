public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.olaMundo();
        System.out.println("\n");

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.retornaDobro(5));
        System.out.println("\n");

        Musica musica = new Musica();
        musica.titulo = "Last of the American Girls";
        musica.artista = "Green Day";
        musica.anoLancamento = 2009;
        musica.exibeFichaTecnica();
        musica.avalia(5.0);
        musica.avalia(4.9);
        musica.avalia(4.8);
        System.out.printf("A média de avaliações desta música é: %.2f", musica.calculaMedia());;
        System.out.println("\n");

        Carro carro = new Carro();
        carro.modelo = "HB20";
        carro.ano = 2017;
        carro.cor = "prata";
        carro.exibeFichaTecnica();
        System.out.println("A idade do carro é: " + carro.exibeIdade(2025));
        System.out.println("\n");

        Aluno aluno = new Aluno();
        aluno.nome = "Assirem";
        aluno.idade = 25;
        aluno.exibeInformacoes();
    }
}
