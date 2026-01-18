import java.util.Scanner;
// Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número que deseja a tabuada: ");
        int numero = leitura.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println("O resultado de " + numero + "x" + i + " eh : " + (numero * i));
        }
    }
}
