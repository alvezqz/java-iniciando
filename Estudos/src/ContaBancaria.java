import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Enzo Alves Sardinha";
        String tipoDeConta = "Corrente";
        double saldo = 2500;
        int escolha = 0;
        double valor = 0; // variável única

        System.out.println("Nome:           " + nome);
        System.out.println("Tipo conta:     " + tipoDeConta);
        System.out.println("Saldo inicial:  R$" + saldo);
        System.out.println("*********************************************************************************");

        while (escolha != 4) {
            System.out.println("Operações");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println("Digite a opção desejada: ");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo eh: R$" + saldo);

            } else if (escolha == 2) {
                System.out.println("Digite o valor: ");
                valor = leitura.nextDouble();

                if (valor > 0) {
                    saldo += valor;
                    System.out.println("Seu saldo ficou em: R$" + saldo);
                } else {
                    System.out.println("Valor inválido");
                }

            } else if (escolha == 3) {
                System.out.println("Digite o valor: ");
                valor = leitura.nextDouble();

                if (valor > 0 && valor <= saldo) {
                    saldo -= valor;
                    System.out.println("Você ficou com o saldo de: R$" + saldo);
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido");
                }

            } else if (escolha == 4) {
                System.out.println("Programa encerrado!");

            } else {
                System.out.println("Digite uma opção válida");
            }
        }

        leitura.close();
    }
}