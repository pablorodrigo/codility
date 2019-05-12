package br.com.others;

public class GCD {

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int generalizedGCD(int num, int[] arr) {

        int result = arr[0];
        for (int i = 1; i < num; i++)
            result = gcd(arr[i], result);

        return result;
    }

    // Function to return gcd of a and b
    private static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static  int generalizedGCDPablo(int num, int[] arr){

        int result = 0;
        int aux = 0;

        for (int i = 1; i < num; i++){
            System.out.println(arr[i] % num);
        }

        result = arr[0] % num;

        return result;
    }


}
