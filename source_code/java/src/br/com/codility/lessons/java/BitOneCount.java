package br.com.codility.lessons.java;

public class BitOneCount {

    // brother solution
    public static int solution(int A, int B) {

        int result = A * B;

        char[] chars = Integer.toBinaryString(result).toCharArray();

        int count = 0;
        for (char caracter : chars) {
            if (caracter == '1') {
                count++;
            }
        }


        return count;
    }



    /* my solution

      public static int solution(int A, int B) {

        int resultado = A * B;
        int contador = 0;
        String binario = Integer.toBinaryString(resultado);
        System.out.println(binario);
        for (int i = 0; i < binario.length(); i++) {

            char caracter = binario.charAt(i);

            if (caracter == '1') {
                contador++;
            }


        }

        return contador;
    }

     */

}
