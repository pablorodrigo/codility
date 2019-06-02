package br.com.others;

import java.util.Stack;

public class Brackets {


    public static int solution2(String S){
        // write your code in Java SE 8
        char[] chrArray=S.toCharArray();
        int len=chrArray.length;
        int closeParan=0;
        int openParan=0;
        int retV=0;
        int pos=0;
        for(int i=len-1;i>=0;i--){
            if(chrArray[i]==')'){
                closeParan++;
                pos=i;
            }else if(chrArray[i]=='(' && i<pos){
                openParan++;
            }
            if(closeParan==openParan){
                closeParan=openParan=0;
            }
        }
        if(closeParan==openParan) retV=1;
        return retV;
    }

    public static int solutution3(String S){
        int len = S.length();

        int qtOpen = 0;

        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == '(') {
                qtOpen++;
            }

            long qtClose = S.substring(i+1).chars().filter(c -> c == ')').count();
            if (qtOpen == qtClose) {
                return i+1;
            }
        }

        return -1;
    }


    public static int solution(String S){

        int len = S.length();
        int[] open = new int[len + 1];
        int[] close = new int[len + 1];
        int result = -1;

        open[0] = 0;
        close[len] = 0;
        if (S.charAt(0)=='(')
            open[1] = 1;
        if (S.charAt(len-1) == ')')
            close[len-1] = 1;

        // Store the number of opening brackets at each index
        for (int i = 1; i < len; i++)
        {
            if ( S.charAt(i) == '(' )
                open[i+1] = open[i] + 1;
            else
                open[i+1] = open[i];
        }

        // Store the number of closing brackets at each index
        for (int i = len-2; i >= 0; i--)
        {
            if ( S.charAt(i) == ')' )
                close[i] = close[i+1] + 1;
            else
                close[i] = close[i+1];
        }

        // check if there is no opening or closing brackets
        if (open[len] == 0)
            return len;
        if (close[0] == 0)
            return 0;

        // check if there is any index at which both brackets are equal
        for (int i=0; i<=len; i++)
            if (open[i] == close[i])
                result = i;

        return result;
    }
}
