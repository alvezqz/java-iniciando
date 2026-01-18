import java.util.Scanner;
// Ex 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
public class Exercicios1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double numero;

        System.out.println("Digite um número: ");
        numero = leitura.nextDouble();
        if (numero > 0){
            System.out.println("O número eh positivo!");
        }
        else {
            System.out.println("O número eh negativo!");
        }






    }
}
