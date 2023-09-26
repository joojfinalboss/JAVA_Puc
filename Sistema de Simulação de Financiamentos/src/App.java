import java.util.Scanner;

public class App {

    public static class Financiamento {
        double valorImovel;
        int prazoFinanciamento;
        double taxaJurosAnual;
        
        void setFinanciamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
            this.valorImovel = valorImovel;
            this.prazoFinanciamento = prazoFinanciamento;
            this.taxaJurosAnual = taxaJurosAnual;
        }

        double calcularPagamentoMensal(){
            double pagamentoMensal = (valorImovel / prazoFinanciamento) * (1 + taxaJurosAnual / 12);
            return pagamentoMensal;
        }
        double calcularPagamentoTotal(double pagamentoMensal){
            double pagamentoTotal = pagamentoMensal * prazoFinanciamento;
            return pagamentoTotal;
        }
        
    }
    public class InterfaceUsuario {
        static double pedirValorImovel(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor do imóvel:\t");
            double valorImovel = scanner.nextDouble();
            return valorImovel;
        }
        static int pedirPrazoFinanciamento(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o prazo de financiamento em anos:\t");
            int prazoFinanciamento = scanner.nextInt();
            return prazoFinanciamento;
        }
        static double pedirTaxaJurosAnual(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor da taxa de juros anual:\t");
            double taxaJurosAnual = scanner.nextDouble();
            return taxaJurosAnual;
        }
    }


    public static void main(String[] args) throws Exception {
        double valorImovel = InterfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = InterfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = InterfaceUsuario.pedirTaxaJurosAnual();

        Financiamento FinanciamentoAtual = new Financiamento();
        FinanciamentoAtual.setFinanciamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }
}
