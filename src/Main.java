import java.util.Scanner;

class Financiamento {

    // Atributos
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;

    // Construtor
    Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Métodos
    double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}

class InterfaceUsuario {

    double pedirValorImovel() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    int pedirPrazoFinanciamento() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    double pedirTaxaJuros() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double taxaJuros = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoAnos, taxaJuros);
    }
}
