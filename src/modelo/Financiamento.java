package modelo;

public class Financiamento {

    // Atributos privados
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Construtor publico
    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Metodos publicos
    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    // Getters publicos
    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    // Metodo para exibir os dados do financiamento
    public void exibirDadosFinanciamento() {
        System.out.println("Valor do Imóvel: R$ " + this.valorImovel);
        System.out.println("Prazo do Financiamento: " + this.prazoFinanciamento + " anos");
        System.out.println("Taxa de Juros Anual: " + this.taxaJurosAnual);
        System.out.println("Pagamento Mensal: R$ " + this.calcularPagamentoMensal());
        System.out.println("Total do Pagamento: R$ " + this.calcularTotalPagamento());
    }
}
