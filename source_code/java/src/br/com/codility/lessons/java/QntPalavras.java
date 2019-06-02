package br.com.codility.lessons.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by pablo on 5/31/17.
 */
public class QntPalavras {

    public static int quantidade(String S) {

        if (S.length() < 1 || S.length() > 100) {
            return 0;
        }
        //System.out.println("Palavra: " + S);

        char caracter;
        StringBuilder frase = new StringBuilder();
        StringTokenizer contarPalavras;
        List<Integer> palavras = new ArrayList<>();


        for (int i = 0; i <= S.length() - 1; i++) {

            caracter = S.charAt(i);

            if (caracter == '.' || caracter == '!' || caracter == '?') {
                contarPalavras = new StringTokenizer(frase.toString());
                //System.out.println("frase: "+frase.toString());
                //System.out.println(contarPalavras.countTokens());
                palavras.add(contarPalavras.countTokens());
                frase = new StringBuilder();
            } else {
                frase.append(caracter);
            }


            // System.out.println("palavra" + frase);

        }

        Integer maior;
        if (!palavras.isEmpty()) {
            maior = Collections.max(palavras);
            return maior;
        }

        return 0;
    }

}
