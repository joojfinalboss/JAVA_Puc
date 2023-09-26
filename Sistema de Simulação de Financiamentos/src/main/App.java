package main;
import modelo.Financiamento;
import util.InterfaceUsuario;
public class App {
    public static void main(String[] args) throws Exception {
        double valorImovel = InterfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = InterfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = InterfaceUsuario.pedirTaxaJurosAnual();

        Financiamento FinanciamentoAtual = new Financiamento();
        FinanciamentoAtual.setFinanciamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        FinanciamentoAtual.exibirDadosFinanciamento(valorImovel, taxaJurosAnual);
    }
}
