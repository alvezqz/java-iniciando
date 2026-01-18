public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluido = false;
        double notaDoFilme = 8.0;
        String tipoPlano = "Plus";


        if (anoDeLancamento > 2022) {
            System.out.println("Filme lançamento");
        } else {
            System.out.println("Filme retro");
        }

        if (incluido == true && tipoPlano.equals("Plus"))
        {
            System.out.println("Filme liberado");
        }
        else {
            System.out.println("Deve pagar aluguel do filme!");
        }
    }
}
