package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Adicionando 4 financiamentos manualmente
        financiamentos.add(new Financiamento(200000, 30, 0.04));
        financiamentos.add(new Financiamento(300000, 20, 0.06));
        financiamentos.add(new Financiamento(150000, 15, 0.03));
        financiamentos.add(new Financiamento(250000, 25, 0.05));

        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        for (Financiamento f : financiamentos) {
            totalValorImoveis += f.getValorImovel();
            totalValorFinanciamentos += f.calcularTotalPagamento();
        }

        System.out.println("Total de todos os imóveis: R$ " + totalValorImoveis);
        System.out.println("Total de todos os financiamentos: R$ " + totalValorFinanciamentos);
    }
}
