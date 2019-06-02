package br.com.others;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SliptString {


    public static String solution(String S) {

        String[] originalText = S.split("\\n");
        String[] texts = S.split("\\n");
        int size = texts.length;


        String[] namePhotos = new String[size];
        String[] citys = new String[size];
        String[] dates = new String[size];
        //String[] format = new String[size];
        List<String> controlNames = new ArrayList<>();
        String[] aux = new String[size];
        String[] result = new String[size];

        //order dates
        /*Arrays.sort(texts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.substring(o1.lastIndexOf(",") + 1).compareTo(o2.substring(o2.lastIndexOf(",") + 1));
            }
        });*/
        Arrays.sort(texts, Comparator.comparing(o -> o.substring(o.lastIndexOf(",") + 1)));

        //split string to get Citys, Dates and Photos names
        for (int i = 0; i < size; i++) {
            int emp = texts[i].indexOf(" ");
            int fi = texts[i].indexOf(",");
            int li = texts[i].lastIndexOf(",");
            int pi = texts[i].indexOf('.');

            //format[i] = texts[i].substring(pi, fi); //formats
            citys[i] = texts[i].substring(fi + 1, li); // citys
            dates[i] = texts[i].substring(li + 1); // dates
            namePhotos[i] = texts[i].substring(0, fi); // photos names
        }


        for (int i = 0; i < size; i++) {

            //control interactions
            if (controlNames.contains(citys[i])) {
                continue;
            }
            String city = citys[i];
            //get frequency
            int frequency = countFreq(city, Arrays.toString(citys));
            int cont = 0;
            //System.out.println(frequency);
            for (int j = 0; j < size; j++) {
                if (city.equals(citys[j])) {

                    cont++;
                    //setting number in photo name
                    if (frequency >= 10 && cont < 10) {
                        aux[j] = namePhotos[j] + "," + citys[j] + "0" + cont + "," + dates[j];
                    } else {
                        aux[j] = namePhotos[j] + "," + citys[j] + cont + "," + dates[j];
                    }
                }
            }

            controlNames.add(citys[i]);
        }

        //fill array in the correct position
        for (int i = 0; i < size; i++) {

            int position = getIndexOf(originalText, aux[i].substring(0, aux[i].indexOf(",")));
            result[position] = aux[i];

        }

        StringBuilder b = new StringBuilder();
        //cut string to show only [City][NumberPhoto].[format]
        for (int i = 0; i < size; i++) {
            int pi = result[i].indexOf('.');
            int fi = result[i].indexOf(",");
            int li = result[i].lastIndexOf(",");

            result[i] = result[i].substring(fi + 1, li) + result[i].substring(pi, fi);
            b.append(result[i]).append("\n");
        }


        return String.valueOf(b);
    }

    private static int getIndexOf(String[] strings, String item) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].substring(0, strings[i].indexOf(",")).equals(item)) return i;
        }
        return -1;
    }

    private static int countFreq(String search, String txt) {
        int M = search.length();
        int N = txt.length();
        int res = 0;

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            /* For current index i, check for pattern match */
            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != search.charAt(j)) {
                    break;
                }
            }

            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            if (j == M) {
                res++;
                //j = 0;
            }
        }
        return res;
    }


}
