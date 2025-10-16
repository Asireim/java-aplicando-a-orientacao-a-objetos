import br.com.alura.exercicios.TabuadaMultiplicacao.TabuadaMultiplicacao;
import br.com.alura.exercicios.calculadoraSalaRetangular.CalculadoraSalaRetangular;
import br.com.alura.exercicios.calculavel.Livro;
import br.com.alura.exercicios.calculavel.ProdutoFisico;
import br.com.alura.exercicios.conversorMoeda.ConversorMoeda;
import br.com.alura.exercicios.conversorTemperatura.ConversorTemperaturaPadrao;
import br.com.alura.exercicios.vendavel.Produto;
import br.com.alura.exercicios.vendavel.Servico;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.setValorDolar(5.47);
        System.out.printf("O valor atual do dólar é: R$ %.2f\n", conversorMoeda.getValorDolar());
        System.out.printf("Este valor de reais em dolar é: R$ %.2f\n", conversorMoeda.converterDolarParaReal(5.00));
        System.out.println("\n");

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.setAltura(20);
        sala.setLargura(5);
        System.out.println("A altura desta sala é: " + sala.getAltura());
        System.out.println("A largura desta sala é: " + sala.getLargura());
        System.out.println("A área desta sala é de: " + sala.calcularArea());
        System.out.println("O perímetro desta sala é de: " + sala.calcularPerimetro());
        System.out.println("\n");

        System.out.println("Tabuada do 2: ");
        TabuadaMultiplicacao num2 = new TabuadaMultiplicacao();
        num2.setNumero(2);
        num2.mostrarTabuada();
        System.out.println("\n");
        System.out.println("Tabuada do 3: ");
        TabuadaMultiplicacao num3 = new TabuadaMultiplicacao();
        num3.setNumero(3);
        num3.mostrarTabuada();
        System.out.println("\n");

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.setCelsius(30);
        conversor.setFahrenheit(68);
        System.out.println(conversor.getCelsius() + "ºC em Fahrenheit é " + conversor.celsiusParaFahrenheit());
        System.out.println(conversor.getFahrenheit() + "ºF em Celsius é " + conversor.fahrenheitParaCelsius());
        System.out.println("\n");

        Livro livro = new Livro();
        livro.setPreco(49.90);
        System.out.printf("Preço original do livro: R$ %.2f\n", livro.getPreco());
        System.out.printf("Preço final após o desconto: R$ %.2f\n", livro.calcularPrecoFinal(10.00));
        System.out.println("\n");
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(139.00);
        System.out.printf("O valor original do produto físico é: R$ %.2f\n", produtoFisico.getPreco());
        System.out.printf("O valor do produto físico após a aplicação de taxas é: R$ %.2f\n", produtoFisico.calcularPrecoFinal(20.00));
        System.out.println("\n");

        Produto produto = new Produto();
        produto.setPreco(50.00);
        produto.setQtdComprada(20);
        System.out.printf("O produto foi comprado " + produto.getQtdComprada() + " vezes pelo valor de: R$ %.2f\n", produto.getPreco());
        System.out.printf("O preço total em compras, considerando o valor e quantidade de vezes comprada, é de: R$ %.2f\n", produto.calculaPrecoTotal());
        System.out.printf("O preço total com impostos é de: R$ %.2f\n", produto.calculaImposto(300.00));
        System.out.printf("O preço total com descontos é de: R$ %.2f\n", produto.calculaDesconto(150));
        System.out.println("\n");
        Servico servico = new Servico();
        servico.setPreco(80.00);
        servico.setVezesContratado(10);
        System.out.printf("O serviço foi contratado " + servico.getVezesContratado() + " vezes pelo valor de: R$ %.2f\n", servico.getPreco());
        System.out.printf("O preço total em compras, considerando o valor e quantidade de vezes comprada, é de: R$ %.2f\n", servico.calculaPrecoTotal());
        System.out.printf("O preço total com impostos é de: R$ %.2f\n", servico.calculaImposto(100.00));
        System.out.printf("O preço total com descontos é de: R$ %.2f\n", servico.calculaDesconto(70));
        System.out.println("\n");
    }
}
