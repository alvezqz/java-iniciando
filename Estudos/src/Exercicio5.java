import java.util.Scanner;
// Scanner leitura = new Scanner(System.in);
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        if (numero % 2 == 0){
            System.out.println("Esse número eh par!");
        } else{
            System.out.println("Esse número eh ímpar");
        }
    }
}
