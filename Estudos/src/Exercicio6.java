import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite o número: ");
        int numero = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " eh: " + fatorial);
    }
}
