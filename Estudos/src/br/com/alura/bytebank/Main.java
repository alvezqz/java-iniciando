package br.com.alura.bytebank;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esse eh o EnzoFlix");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("O ano de lançamento eh: " + anoDeLancamento);
        boolean incluido = true;
        double notaDoFilme = 8.0;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com bom ator";
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
    }