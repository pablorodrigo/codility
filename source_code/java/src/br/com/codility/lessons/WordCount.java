package br.com.codility.lessons;

public class WordCount {

    public static String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int best_res = 0;

        for (int i = 1; i < 26; i++) {

            System.out.println("occurrences - " + occurrences[i] + "-" + i);

            if (occurrences[i] >= best_res && best_res != occurrences[i]) {

                best_char = (char) ((int) 'a' + i);

                best_res = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }
}


