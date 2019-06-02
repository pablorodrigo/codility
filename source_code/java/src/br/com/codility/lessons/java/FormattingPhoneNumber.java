package br.com.codility.lessons.java;

import java.util.StringJoiner;

/**
 * Created by pablo on 7/11/17.
 */
public class FormattingPhoneNumber {

    public static String solution(String S) {

        if (S == null || S.isEmpty() || S.length() < 2) {
            return null;
        }

        //usado para juntar strings (tipo uma lista de char) podendo ter um delimitador
        StringJoiner resultado = new StringJoiner("-");

        //substituir uma char por outro (aqui estou retirando o "-" e o " ")
        S = S.replaceAll(" ", "")
                .replaceAll("-", "");


        //pegar tamanho da string para fazer o calculo, assim,
        //tendo o formato correto do numero do telefone
        int tamanhoStringS = S.length();

        //saber o maximo de sequencia de numeros que pode ter 3 digitos
        int max = tamanhoStringS - 2 * Math.floorMod(3 - tamanhoStringS, 3);

        //preenchimento da sequencia de numero que tem 3 digitos
        for (int i = 0; i < max; i += 3) {
            resultado.add(S.substring(i, i + 3));
        }
        //preenchimento da sequencia de numero que tem 2 digitos
        for (int i = max; i < tamanhoStringS; i += 2) {
            resultado.add(S.substring(i, i + 2));
        }

        //retorna resultado obtido
        return String.valueOf(resultado);
    }

}
