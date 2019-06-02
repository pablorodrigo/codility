package br.com.codility.lessons.java;

/**
 * Created by pablo on 7/9/17.
 */
public class MaxDistance {

    public static int distancia(int A, int B, int C, int D) {

        if (A > 5000 || A < -5000 ||
                B > 5000 || B < -5000 ||
                C > 5000 || C < -5000 ||
                D > 5000 || D < -5000) {
            return 0;
        }

        double distancia = 0;

        double x1 = A;
        double x2 = D;
        double y1 = C;
        double y2 = B;


        distancia = (Math.pow((x1 - x2), 2) +
                Math.pow((y1 - y2), 2));


        return (int) distancia;
    }


}
