package br.com.codility.lessons;

/**
 * Created by pablo on 5/31/17.
 */
public class LinkedList {

    // brother solution
    public static int solution(int[] A) {

        int index = 0;
        int length = 0;

        while (true) {
            System.out.println(A[index]);
            length++;
            int k = A[index];

            if (k != -1) {
                index = k;
            } else {
                break;
            }

        }

        return length;

    }

    /* my solution

    public static int solution1(int[] A) {

        int contador = 1;

        for (int i = 0; i < A.length; ) {

            if (A[i] != -1) {
                contador++;
                i = A[i];
            } else {
                break;
            }

        }

        return contador;
    }
     */

}
