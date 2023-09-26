package util;
import java.util.Scanner;
public class InterfaceUsuario {
    public static double pedirValorImovel(){
        Scanner scanner = new Scanner(System.in);
        double valorImovel = 0;
        boolean pedirEntrada = true;

        while (pedirEntrada == true){
            try {
                System.out.println("Digite o valor do imóvel:\t");
                valorImovel = scanner.nextDouble();
                if (valorImovel >= 0) {
                    pedirEntrada = false;
                    return valorImovel;
                } else {
                    System.out.println("Valor inválido.");
            }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Valor inválido.");
            }

        }

        return valorImovel;
    }
    public static int pedirPrazoFinanciamento(){
        Scanner scanner = new Scanner(System.in);
        int prazoFinanciamento = 0;
        boolean pedirEntrada = true;
        while (pedirEntrada == true){
            try {
                System.out.println("Digite o prazo de financiamento em anos:\t");
                prazoFinanciamento = scanner.nextInt();
                if (prazoFinanciamento >= 0) {
                    pedirEntrada = false;
                    return prazoFinanciamento;
                } else {
                    System.out.println("Valor inválido.");
                } 
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Valor Inválido");
                }
        }
        
        return prazoFinanciamento;
    }
    public static double pedirTaxaJurosAnual(){
        Scanner scanner = new Scanner(System.in);
        double taxaJurosAnual = 0;
        boolean pedirEntrada = true;
        while (pedirEntrada ==true){
            try {
                System.out.println("Digite o valor da taxa de juros anual:\t");
                taxaJurosAnual = scanner.nextDouble();
                if (taxaJurosAnual >= 0){
                    pedirEntrada = false;
                    return taxaJurosAnual;
                } else {
                    System.out.println("Valor Inválido");
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Valor Inválido");
            }
        }

        return taxaJurosAnual;
    }
}