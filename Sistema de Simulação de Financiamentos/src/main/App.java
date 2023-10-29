package main;
import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Financiamento> ListaFinanciamentos = new ArrayList<Financiamento>();
        double valorTotalImoveis = 0;
        double valorTotalFinanciamentos = 0;
        int contadorFinanciamento = 0;

        
        for (int contador = 0; contador < 4; contador++){
            // Solicita os valores do financiamento
            double valorImovel = InterfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = InterfaceUsuario.pedirPrazoFinanciamento();
            double taxaJurosAnual = InterfaceUsuario.pedirTaxaJurosAnual();

            Financiamento financiamentoAtual = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

            // Cria um objeto de financiamento
            ListaFinanciamentos.add(financiamentoAtual);
        }
        // Calcula os valores de financiamento do objeto criado
        for (Financiamento unidadeFinanciamento : ListaFinanciamentos) {
            double pagamentoMensal = unidadeFinanciamento.calcularPagamentoMensal();
            double pagamentoTotal = unidadeFinanciamento.calcularPagamentoTotal(pagamentoMensal);
            double valorUnidadeImovel = unidadeFinanciamento.getValorImovel();
        
            valorTotalImoveis = valorTotalImoveis + valorUnidadeImovel;
            valorTotalFinanciamentos = valorTotalFinanciamentos + pagamentoTotal;
            
            contadorFinanciamento = contadorFinanciamento + 1;
            System.out.println("FINANCIAMENTO " + contadorFinanciamento);

            unidadeFinanciamento.exibirDadosFinanciamento(valorUnidadeImovel, pagamentoMensal, pagamentoTotal);
        }

        System.out.println(String.format("Total de todos imóveis é: %.2fR$", valorTotalImoveis));
        System.out.println(String.format("Total de todos financiamentos é: %.2fR$", valorTotalFinanciamentos));
    }
}
