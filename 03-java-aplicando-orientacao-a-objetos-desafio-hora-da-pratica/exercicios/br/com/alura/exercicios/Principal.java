package br.com.alura.exercicios;
import br.com.alura.exercicios.animal.Cachorro;
import br.com.alura.exercicios.animal.Gato;
import br.com.alura.exercicios.carro.ModeloCarro;
import br.com.alura.exercicios.contaBancaria.ContaCorrente;
import br.com.alura.exercicios.numerosPrimos.GeradorPrimo;
import br.com.alura.exercicios.numerosPrimos.NumerosPrimos;
import br.com.alura.exercicios.numerosPrimos.VerificadorPrimo;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro hb20 = new ModeloCarro();
        hb20.definirModelo("HB20");
        hb20.definirPrecos(45000, 48000, 50000);
        hb20.exibirInfo();
        hb20.setCarroceria("Hatch");
        System.out.println("A carroceria é: " + hb20.getCarroceria());
        hb20.setTipoMotor("1.0 Turbo");
        System.out.println("O tipo de motor é: " + hb20.getTipoMotor());
        hb20.setCambioAutomatico(false);
        hb20.isCambioAutomatico();
        hb20.setQtdPassageiros(4);
        System.out.println("A quantidade de passageiros possíveis é: " + hb20.getQtdPassageiros());
        System.out.println("\n");

        Cachorro cachorro = new Cachorro();
        cachorro.abanarRabo();
        cachorro.emitirSom();
        System.out.println("\n");
        Gato gato = new Gato();
        gato.arranharMoveis();
        gato.emitirSom();
        System.out.println("\n");

        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println("Efetuando depósito de: R$ 150,99...");
        contaCorrente.depositar(150.99);
        System.out.printf("O saldo após o depósito é: R$ %.2f\n", contaCorrente.consultarSaldo());
        System.out.println("Efetuando saque de: R$ 50,00...");
        contaCorrente.sacar(50.00);
        System.out.printf("O saldo após o saque é: R$ %.2f\n", contaCorrente.consultarSaldo());
        System.out.println("Efetuando saque de: R$ 200,00...");
        contaCorrente.sacar(200.00);
        System.out.println("Efetuando a cobrança da tarifa mensal");
        contaCorrente.cobrarTarifaMensal();
        System.out.printf("O saldo após a cobrança da tarifa mensal é de: R$ %.2f\n", contaCorrente.consultarSaldo());
        System.out.println("\n");

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);
        System.out.println("\n");
        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);
        System.out.println("\n");
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
        System.out.println("\n");
    }
}
