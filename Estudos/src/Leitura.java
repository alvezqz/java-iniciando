import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação de 0 a 10:");
        double avaliacao = leitura.nextDouble();

        System.out.println("O filme definido como favorito por voce eh: " + filme + "e o ano de lançamento eh: " + anoDeLancamento + " e sua avaliação foi: " + avaliacao);

    }
}
