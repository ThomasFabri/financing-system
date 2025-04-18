package util;

import java.util.Scanner;

public class InterfaceUsuario {

    public double pedirValorImovel() {
        Scanner sc = new Scanner(System.in);
        double valor;
        do {
            valor = sc.nextDouble();
            if (valor <= 0) {
                System.out.println("Valor inválido. Digite um valor positivo para o imóvel.");
            }
        } while (valor <= 0);
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        Scanner sc = new Scanner(System.in);
        int prazo;
        do {
            prazo = sc.nextInt();
            if (prazo <= 0) {
                System.out.println("Prazo inválido. Digite um número positivo de anos.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double pedirTaxaJuros() {
        Scanner sc = new Scanner(System.in);
        double taxa;
        do {
            taxa = sc.nextDouble();
            if (taxa <= 0) {
                System.out.println("Taxa inválida. Digite uma taxa de juros anual positiva.");
            }
        } while (taxa <= 0);
        return taxa;
    }
}
