package br.com.codility.lessons.java;

/**
 * Created by pablo on 7/12/17.
 */
public class CyclicRotation {

    public static int[] solution(int[] A, int K) {

        if (K > 100) {
            return null;
        }
        for (int verificacao : A) {
            if (verificacao > 1000 || verificacao < -1000)
                return null;
        }

        int[] resposta = new int[A.length];


        for (int i = 0; i <= A.length - 1; i++) {
            resposta[(i + K) % A.length] = A[i];
        }

        return resposta;
    }

}
