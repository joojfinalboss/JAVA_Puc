package modelo;
public class Financiamento {
    
    // Atributos 
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Métodos construtores
    public void setValorImovel(double valorImovel){
        this.valorImovel = valorImovel;
    }

    public void setPrazoFinanciamento(int prazoFinanciamento){
        this.prazoFinanciamento = prazoFinanciamento;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual){
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel(){
        return valorImovel;
    }

    public int getPrazoFinanciamento(){
        return prazoFinanciamento;
    }

    public double taxaJurosAnual(){
        return taxaJurosAnual;
    }

    public void setFinanciamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        setValorImovel(valorImovel);
        setPrazoFinanciamento(prazoFinanciamento);
        setTaxaJurosAnual(taxaJurosAnual);
    }

    // Métodos Geral;
    public double calcularPagamentoMensal(){
        double pagamentoMensal = (valorImovel / prazoFinanciamento) * (1 + taxaJurosAnual / 12);
        return pagamentoMensal;
    }
    public double calcularPagamentoTotal(double pagamentoMensal){
        double pagamentoTotal = pagamentoMensal * prazoFinanciamento;
        return pagamentoTotal;
    }

    public void exibirDadosFinanciamento(double valorImovel, double pagamentoTotal){
        System.out.println("O valor do imóvel é: " + valorImovel);
        System.out.println("O valor total do financiamento é: " + pagamentoTotal);
    }
    
}