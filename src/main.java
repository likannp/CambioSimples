import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        System.out.println(opcao);
    }
}
