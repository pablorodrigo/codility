package br.com.codility.lessons.java;

public class CardsWar {

    public static int Solution(String A, String B) {

        //A - ace
        //K - king
        //Q - queen
        //J - jock
        //T - ten
        //9 - 2

        int tamanho = A.length();

        if (tamanho < 1 || tamanho > 1000) {
            return 0;
        }

        if (A.length() != B.length()) {
            return 0;
        }


        int play1Count = 0;
        int play2Count = 0;

        for (int i = 0; i < tamanho; i++) {
            if (Character.isDigit(A.charAt(i)) && Character.isDigit((B.charAt(i)))) {

                int valor1 = Integer.parseInt(String.valueOf(A.charAt(i)));
                int valor2 = Integer.parseInt(String.valueOf(B.charAt(i)));

                //verificacao dos numeros
                if (valor1 > valor2) {
                    play1Count++;
                } else {
                    play2Count++;
                }

            } else if (Character.isDigit(A.charAt(i)) && !Character.isDigit((B.charAt(i)))) {
                play2Count++;
            } else if (!Character.isDigit(A.charAt(i)) && Character.isDigit((B.charAt(i)))) {
                play1Count++;
            }


            if (A.charAt(i) == 'A' && B.charAt(i) == 'K') {

                play1Count++;

            }
            if (A.charAt(i) == 'A' && B.charAt(i) == 'Q') {

                play1Count++;

            }

            if (A.charAt(i) == 'A' && B.charAt(i) == 'J') {

                play1Count++;

            }
            if (A.charAt(i) == 'A' && B.charAt(i) == 'T') {

                play1Count++;

            }
            if (A.charAt(i) == 'K' && B.charAt(i) == 'Q') {

                play1Count++;

            }
            if (A.charAt(i) == 'K' && B.charAt(i) == 'J') {

                play1Count++;

            }
            if (A.charAt(i) == 'K' && B.charAt(i) == 'T') {

                play1Count++;

            }
            if (A.charAt(i) == 'Q' && B.charAt(i) == 'J') {

                play1Count++;

            }
            if (A.charAt(i) == 'Q' && B.charAt(i) == 'T') {

                play1Count++;

            }
            if (A.charAt(i) == 'J' && B.charAt(i) == 'T') {

                play1Count++;

            }


        }


        return play1Count;

    }

}
