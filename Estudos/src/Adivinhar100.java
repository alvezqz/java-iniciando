import java.util.Random;
import java.util.Scanner;

public class Adivinhar100 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroChute;
        int totalDeTentativas = 5;
        boolean ganhou = false;


        for (int i = 0; i < totalDeTentativas; i++) {

            System.out.println("Chute um número: ");
            numeroChute = leitura.nextInt();
            if (numeroChute == numeroAleatorio ) {
                System.out.println("Parabéns, voce ganhou o jogo!");
                ganhou = true; // Definir o booleano que ganhou para nao mostrar resultado se tiver ganho o jogo.
                break;
            } else if (numeroChute > numeroAleatorio) {
                System.out.println("O número eh menor");
            } else {
                System.out.println("O número eh maior ");
            }

            int restantes = totalDeTentativas - (i + 1);
            System.out.println("O jogador ainda tem o total de: " + restantes + " tentativas");
        }

        if (!ganhou){ //  ganhou começa como false; se o jogador acerta, ela vira true. No final, if (!ganhou) significa “se o jogador NÃO ganhou”, então o programa só entra nesse bloco quando todas as tentativas acabaram sem acerto e, por isso, mostra o número sorteado.
            System.out.println("O número era: " + numeroAleatorio);
        }

    }
}
