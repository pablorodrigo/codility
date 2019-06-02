package br.com.codility.lessons.java;

public class CardGame {

    public static int solution(String A, String B) {
        // write your code in Java SE 8

        //A - ace
        //K - king
        //Q - queen
        //J - jock
        //T - ten
        //9 - 2

        int tamanho = A.length();

        int play1Count = 0;
        int play2Count = 0;


        for (int i = 0; i < tamanho; i++) {


            if (Character.isDigit(A.charAt(i)) && Character.isDigit((B.charAt(i)))) {

                //verificacao dos numeros
                if (A.indexOf(i) > B.indexOf(i)) {
                    play1Count++;
                } else {
                    play2Count++;
                }

            }

            if (A.charAt(i) == 'A' && B.charAt(i) != 'A'){

                play1Count++;

            }


        }

        if (play1Count > play2Count) {
            return play1Count;
        } else if (play1Count == play2Count) {
            return 0;
        } else {
            return play2Count;
        }


    }


}
