package br.com.others;

public class AmazonSumArray {

    public static int solution(int[] A) {


        int sumResult = 0;
        for (int number : A) {
            if (Math.abs(number) > 9 && Math.abs(number) < 100) { //check if they are 2 digits
                sumResult += number; //sum
            }
        }

        return sumResult;

    }
}
