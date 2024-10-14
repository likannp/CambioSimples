package cambiosimples;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyService currencyService = new CurrencyConverterServiceImpl();

        String moedaOrigem = "";
        String moedaDestino = "";

        System.out.println("****************************");
        System.out.println("Seja bem-vindo/a ao Cambio Simples =]");
        System.out.println("1) Dólar  =>>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileiro");
        System.out.println("4) Real brasileiro =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Sair");
        System.out.println("Escolha uma opção válida:");
        System.out.println("****************************");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                moedaOrigem = "USD";
                moedaDestino = "ARS";
                break;
            case 2:
                moedaOrigem = "ARS";
                moedaDestino = "USD";
                break;
            case 3:
                moedaOrigem = "USD";
                moedaDestino = "BRL";
                break;
            case 4:
                moedaOrigem = "BRL";
                moedaDestino = "USD";
                break;
            case 5:
                moedaOrigem = "USD";
                moedaDestino = "COP";
                break;
            case 6:
                moedaOrigem = "COP";
                moedaDestino = "USD";
                break;
            case 7:
                System.out.println("Saindo...");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                System.exit(0);
        }

        System.out.println("Digite o valor que deseja converter:");
        double valorEntrada = scanner.nextDouble();

        try {
            double valorConvertido = currencyService.converter(moedaOrigem, moedaDestino, valorEntrada);
            System.out.println("Valor " + valorEntrada + " [" + moedaOrigem + "] corresponde ao valor final de =>>> "
                    + valorConvertido + " [" + moedaDestino + "]");
        } catch (Exception e) {
            System.out.println("Erro na conversão: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}