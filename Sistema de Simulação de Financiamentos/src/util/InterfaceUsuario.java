package util;
import java.util.Scanner;
public class InterfaceUsuario {
    public static double pedirValorImovel(){
        Scanner scanner = new Scanner(System.in);
        double valorImovel = 0;
        boolean semErro = true;

        while (semErro == true);
            System.out.println("Digite o valor do imóvel:\t");
            double valorDigitado = scanner.nextDouble();
            if (valorDigitado >= 0) {
                valorImovel = valorDigitado;
                semErro = false;
            } else {
                System.out.println("Valor inválido.");
            }
        return valorImovel;
    }
    public static int pedirPrazoFinanciamento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o prazo de financiamento em anos:\t");
        int prazoFinanciamento = scanner.nextInt();
        
        return prazoFinanciamento;
    }
    public static double pedirTaxaJurosAnual(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da taxa de juros anual:\t");
        double taxaJurosAnual = scanner.nextDouble();
        return taxaJurosAnual;
    }
}