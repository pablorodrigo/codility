package br.com.codility.lessons;

import java.util.HashMap;

/**
 * Created by pablo on 6/8/17.
 */
public class OddOccurrencesInArray {

    public static int solution(int[] A) {


     /*   for (int i = 0; i < A.length; i++) {
            //System.out.println(A[i]);
            if (occurs.containsKey(A[i]) && occurs.get(A[i]) == 1) {
                occurs.remove(A[i]);
            } else {
                occurs.put(A[i], 1);
            }


        }*/

        // verificacoes
        if ((A.length % 2) == 0) {
            System.out.println("par");
            return 0;
        } else if (A.length < 1 || A.length > 1000000) {
            return 0;
        }

        HashMap<Integer, Integer> occurs = new HashMap<>();

        // verifica ocorrencias
        for (int number : A) {

            if (number < 1 || number > 1000000000)
                return 0;

            if (occurs.containsKey(number) && occurs.get(number) == 1) {
                occurs.remove(number);
            } else {
                occurs.put(number, 1);
            }
        }

        // return chave
        for (int key : occurs.keySet()) {
            return key;
        }

        return 0;

    }

}
