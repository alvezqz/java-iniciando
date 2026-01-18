import java.util.Scanner;
// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado eh: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A área do círculo eh: " + areaCirculo);
            } else if (escolha  == 3) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção Inválida");
            }

        }

    }
}
