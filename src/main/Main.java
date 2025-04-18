package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite os dados do financiamento " + i + ":");

            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazo = interfaceUsuario.pedirPrazoFinanciamento();
            double taxa = interfaceUsuario.pedirTaxaJuros();

            Financiamento f = new Financiamento(valorImovel, prazo, taxa);
            financiamentos.add(f);

            System.out.println("Financiamento " + i + " – valor do imóvel: R$ " + f.getValorImovel() +
                    ", valor do financiamento: R$ " + f.calcularTotalPagamento());
        }

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento f : financiamentos) {
            totalImoveis += f.getValorImovel();
            totalFinanciamentos += f.calcularTotalPagamento();
        }

        System.out.println("Total de todos os imóveis: R$ " + totalImoveis);
        System.out.println("Total de todos os financiamentos: R$ " + totalFinanciamentos);
    }
}