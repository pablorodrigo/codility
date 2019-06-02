package br.com.codility.lessons.java;

/**
 * Created by pablo on 7/12/17.
 */
public class FrogJmp {

    public static int solution(int X, int Y, int D) {

        // the best solution
        //return (int)Math.ceil((Y - X) / (double)D);

        int count = 0;

        while (X < Y) {

            X += D;
            count++;

        }

        return count;
    }

}
