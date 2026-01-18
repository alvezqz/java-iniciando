import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a sua nota do filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        // Verificação
        if (mediaAvaliacao == 0||totalDeNotas == 0){  // se o programa for encerrado de primeira NÃO dará certo.
            System.out.println("Média inválida");
        }
        else {
            System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas); // Não permitir 0 / 0.
        }




    }
}
