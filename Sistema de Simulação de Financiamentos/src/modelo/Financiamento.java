package modelo;
public class Financiamento {
    
    // Atributos 
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Métodos construtores

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

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
        double pagamentoMensal = ((valorImovel / prazoFinanciamento)) * (1 + (taxaJurosAnual / 12));
        return pagamentoMensal;
    }
    public double calcularPagamentoTotal(double pagamentoMensal){
        double pagamentoTotal = pagamentoMensal * prazoFinanciamento;
        return pagamentoTotal;
    }

    public void exibirDadosFinanciamento(double valorImovel, double pagamentoMensal, double pagamentoTotal){
        System.out.println(String.format("O valor do imóvel é: %.2fR$ ", valorImovel));
        System.out.println(String.format("O valor do pagamento mensal é: %.2fR$", pagamentoMensal));
        System.out.println(String.format("O valor total do financiamento é: %.2fR$", pagamentoTotal));
    }
    
}