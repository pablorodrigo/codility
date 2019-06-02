package br.com.codility.lessons.java;

/**
 * Created by pablo on 5/31/17.
 */
public class RetornarPosicaoNumeros {

    public static int retornarValor(int A, int B) {

        if (A < 0 || A > 999999999) {
            return -1;
        }
        if (B < 0 || B > 999999999) {
            return -1;
        }

        String numero = Integer.toString(A);
        String conjunto = Integer.toString(B);

        if (!conjunto.contains(numero)) {
            return -1;
        }

        return conjunto.indexOf(numero);
    }

}
