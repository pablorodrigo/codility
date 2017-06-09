package br.com.codility.lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by pablo on 5/30/17.
 */
public class BinaryGrap {


    public static int intervalorNumero(int numero) {

        List<Integer> intervalos = new ArrayList<>();
        int contador = 0;

        if (numero == 0) {
            System.out.println("0");
            return 0;
        }

        String binario = Integer.toBinaryString(numero);

        System.out.println("binario: " + binario);

        int index_primeiro = binario.indexOf("1");

        int index_ultimo = binario.lastIndexOf("1");

        //System.out.println("primeiro index: "+index_primeiro);

        //System.out.println("ultimo index: "+index_ultimo);

        for (int i = index_primeiro; i <= index_ultimo; i++) {
            System.out.println("dentro do for");

            char caracter = binario.charAt(i);

            if (caracter == '0') {
                contador++;
            } else if (contador != 0) {

                intervalos.add(contador);
                contador = 0;
            }

        }
        Integer maior;
        if (!intervalos.isEmpty()) {
            maior = Collections.max(intervalos);
            return maior;
        }

        return 0;

    }


}


