import java.util.Scanner;
// Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o primeiro número: ");
        num1 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leitura.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número eh maior que o segundo");
        } else if (num1 < num2) {
            System.out.println("O segundo número eh maior que o primeiro");
        }
        else {
            System.out.println("Os dois números são iguais");
        }


    }
}
