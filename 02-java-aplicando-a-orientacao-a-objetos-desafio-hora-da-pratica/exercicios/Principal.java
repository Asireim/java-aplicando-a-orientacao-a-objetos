public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular = "Assirem Jacoby";
        contaBancaria.setNumeroConta(12345678);
        System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
        contaBancaria.setSaldo(10000.99);
        System.out.println("Saldo da conta: " + contaBancaria.getSaldo());
        System.out.println("\n");

        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Assírem Jacoby");
        System.out.println(pessoa.getNome());
        pessoa.setIdade(25);
        System.out.println(pessoa.getIdade());
        pessoa.verificarIdade();
        System.out.println("\n");

        Produto produto = new Produto();
        produto.setNome("Coca-cola");
        System.out.println(produto.getNome());
        produto.setPreco(12.00);
        System.out.println("Preço do produto: " + produto.getPreco());
        produto.aplicarDesconto(10.00);
        System.out.println("Novo preço com desconto: " + produto.getPreco());
        System.out.println("\n");

        Aluno aluno = new Aluno();
        aluno.setNome("Assírem");
        System.out.println(aluno.getNome());
        aluno.setNotas(10);
        aluno.setNotas(9);
        aluno.setNotas(10);
        System.out.println("A soma das notas do aluno é: " + aluno.getNotas());
        System.out.printf("A média deste aluno é: %.2f", aluno.calcularMedia());
        System.out.println("\n");

        Livro livro = new Livro();
        livro.setTitulo("Clean Code");
        System.out.println(livro.getTitulo());
        livro.setAutor("Robert Cecil Martin");
        System.out.println(livro.getAutor());
        livro.exibirDetalhes();
    }
}
