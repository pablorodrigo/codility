package br.com.codility.lessons.java;

public class PlayList {

    public static String solution(String S) {
        String[] lines = S.split("\r\n|\r|\n");
        //System.out.println(lines.length);
        StringBuilder result = new StringBuilder();

        String regex = "^[^0-9]*([0-9]*).*$";

       /* String test = "some words 234 and more 678";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        matcher.matches();
        System.out.println(matcher.group(1));
*/


        for (String line : lines) {



            //music
            if (line.contains("mp3") || S.contains("aac") || S.contains("flac")){
                result.append("music");
                //System.out.println(line.substring(line.lastIndexOf("mp3")).replace("mp3", ""));
            }

            //image
            if (line.contains("jpg") || S.contains("bmp") || S.contains("gif"))
                result.append("image");
            //movie
            if (line.contains("mp4") || S.contains("avi") || S.contains("mkv"))
                result.append("movie");
            //others
            if (line.contains("7z") || S.contains("txt") || S.contains("zip"))
                result.append("other");


            result.append("\n");

        }


        System.out.println(result);

        return "";
    }

}
