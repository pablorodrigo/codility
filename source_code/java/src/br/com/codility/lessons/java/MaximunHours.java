package br.com.codility.lessons.java;

/**
 * Created by pablo on 7/9/17.
 */
public class MaximunHours {

    public static String maximunHour(int A, int B, int C, int D) {

        //tratamento dos arrays
        int DIG1_HORA = 0;
        int DIG2_HORA = 1;
        int DIG1_MINUTO = 2;
        int DIG2_MINUTO = 3;

        Integer[] valores = new Integer[]{A, B, C, D};

        Integer[] resultado = new Integer[]{-1, -1, -1, -1};

        // Regras das horas:
        // 1º digito: de 0 à 2
        int delIndex = -1;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] <= 2 && valores[i] > resultado[0]) {
                resultado[DIG1_HORA] = valores[i];
                delIndex = i;
            }
        }
        if (delIndex != -1) {
            valores[delIndex] = -1;
        }

        // 2º digito: de 0 à 9, quando o 1º for 0 ou 1. De 0 à 3 quando o 1º for 2
        delIndex = -1;
        for (int i = 0; i < valores.length; i++) {
            if ((resultado[0] >= 0 && resultado[0] < 2) && valores[i] <= 9 && valores[i] > resultado[1]) {
                resultado[DIG2_HORA] = valores[i];
                delIndex = i;
            } else {
                if (valores[i] <= 3 && valores[i] > resultado[1]) {
                    resultado[DIG2_HORA] = valores[i];
                    delIndex = i;
                }
            }
        }
        if (delIndex != -1) {
            valores[delIndex] = -1;
        }

        // Regras dos minutos:
        // 1º digito: de 0 à 5
        delIndex = -1;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] <= 5 && valores[i] > resultado[2]) {
                resultado[DIG1_MINUTO] = valores[i];
                delIndex = i;
            }
        }
        if (delIndex != -1) {
            valores[delIndex] = -1;
        }

        // 2º digito: de 0 à 9
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] <= 9 && valores[i] > resultado[3]) {
                resultado[DIG2_MINUTO] = valores[i];
            }
        }

        for (Integer r : resultado) {
            if (r == -1) {
                return "NOT POSSIBLE";
            }
        }

        //return Arrays.toString(resultado);
        return resultado[0].toString() + resultado[1].toString() + ":" + resultado[2].toString() + resultado[3].toString();
 /*
        resolve alguns casos
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(resposta));
            for (int k = 0; k < limites.length; k++) {
                if (Collections.max(array) <= limites[k] && resposta[k] == 0) {
                    resposta[k] = Collections.max(array);
                    array.remove(Collections.max(array));
                    break;
                }

            }
        }*/

    }

}
