package br.com.others;

import java.text.ParseException;

public class MainTests {

    public static void main(String[] args) {
        //int[] A = {1,100,80,-91};
        //System.out.println(AmazonSumArray.solution(A));

        /*String S1 = "(())";
        System.out.println(Brackets.solution(S1));
        String S2 = "(())))(";
        System.out.println(Brackets.solution(S2));
        String S3 = "))";
        System.out.println(Brackets.solution(S3));*/

        /*
        photo.jpg, Warsaw, 2013-09-05 14:08:15
        john.png, London, 2015-06-20 15:13:22
        myFriends.png, Warsaw, 2013-09-05 14:07:13
        Eiffel.jpg, Paris, 2015-07-23 08:03:02
        pisatower.jpg, Paris, 2015-07-22 23:59:59
        BOB.jpg, London, 2015-08-05 00:02:03
        notredame.png, Paris, 2015-09-01 12:00:00
        me.jpg, Warsaw, 2013-09-06 15:40:22
        a.png, Warsaw, 2016-02-13 13:33:50
        b.jpg, Warsaw, 2016-01-02 15:12:22
        c.jpg, Warsaw, 2016-01-02 14:34:30
        d.jpg, Warsaw, 2016-01-02 15:15:01
        e.png, Warsaw, 2016-01-02 09:49:09
        f.png, Warsaw, 2016-01-02 10:55:32
        g.jpg, Warsaw, 2016-02-29 22:13:11
        */

        String str =
                "photo.jpg, Warsaw, 2013-09-05 14:08:15\n" +
                "john.png, London, 2015-06-20 15:13:22\n" +
                "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" +
                "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n" +
                "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" +
                "BOB.jpg, London, 2015-08-05 00:02:03\n" +
                "notredame.png, Paris, 2015-09-01 12:00:00\n" +
                "me.jpg, Warsaw, 2013-09-06 15:40:22\n" +
                "a.png, Warsaw, 2016-02-13 13:33:50\n" +
                "b.jpg, Warsaw, 2016-01-02 15:12:22\n" +
                "c.jpg, Warsaw, 2016-01-02 14:34:30\n" +
                "d.jpg, Warsaw, 2016-01-02 15:15:01\n" +
                "e.png, Warsaw, 2016-01-02 09:49:09\n" +
                "f.png, Warsaw, 2016-01-02 10:55:32\n" +
                "g.jpg, Warsaw, 2016-02-29 22:13:11";

        System.out.println(SliptString.solution(str));

    }

}
