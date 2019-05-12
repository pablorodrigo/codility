package br.com.codility.lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordMachine {

    public static int solution(String S) {

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(S);
        List<String> stringList = new ArrayList<>();
        int count = 0;
        while (matcher.find()) {


            if (Character.isDigit(S.charAt(count))) {
                stringList.add(String.valueOf(S.charAt(count)));
            } else {
                if (String.valueOf(S.charAt(count)).equals("POP")) {
                    stringList.remove(stringList.size() - 1);
                }
                if (String.valueOf(S.charAt(count)).equals("DUP")) {
                    stringList.add(stringList.get(stringList.size() - 1));
                }
                if (String.valueOf(S.charAt(count)).equals("+")) {
                  //stringList.add()
                }
                if (String.valueOf(S.charAt(count)).equals("-")) {

                }
            }

            System.out.println(matcher.group());
        }

        return stringList.size();

    }
}
