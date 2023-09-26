package main;
import modelo.Financiamento;
import util.InterfaceUsuario;
public class App {
    public static void main(String[] args) throws Exception {

        // Solicita os valores do financiamento
        double valorImovel = InterfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = InterfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = InterfaceUsuario.pedirTaxaJurosAnual();

        // Cria um objeto de financiamento
        Financiamento FinanciamentoAtual = new Financiamento();
        FinanciamentoAtual.setFinanciamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

        // Calcula os valores de financiamento do objeto criado
        double pagamentoMensal = FinanciamentoAtual.calcularPagamentoMensal();
        double pagamentoTotal = FinanciamentoAtual.calcularPagamentoTotal(pagamentoMensal);
        FinanciamentoAtual.exibirDadosFinanciamento(valorImovel, pagamentoTotal);
    }
}
