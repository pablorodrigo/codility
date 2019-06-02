package br.com.codility.lessons.java;

public class PermMissingElem {

    public static int solution(int[] A) {

        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum += A[i];
            System.out.println("SUM: "+sum);
        }


        if (A.length % 2 == 0) {
            return -sum + (A.length / 2 + 1) *(A.length + 1);
        } else {
            return -sum + (A.length / 2 + 1) * (A.length + 2);
        }

        //return A.length % 2 == 0 ? -sum + (A.length/2 + 1) * (A.length+1)
        //       : -sum + (A.length/2 + 1) * (A.length+2);

    }

}
