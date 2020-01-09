package br.com.codility.lessons.java;

public class Main {

    public static void main(String[] args) {

        /**
         * BinaryGrap
         */
        //int intervalo = BinaryGrap.intervalorNumero(1040);
        //System.out.println("intervalor" + intervalo);

        /**
         * PermMissingElem
         */

        //int[] A = {2,3,1,5};
        //System.out.println(PermMissingElem.solution(A));

        /**
         * PermCheck
         */

        /*int[] A = {4,1,3,2};
        int[] B = {4,1,3};
        System.out.println(PermCheck.solution(A));
        System.out.println(PermCheck.solution(B));*/

        /**
         * QntPalavras
         */
        //int qnt = QntPalavras.quantidade("We test coders. Give us a try?");
        //int qnt = QntPalavras.quantidade("Forget CVs..Save time . x x");

        /**
         * RetornarPosicaoNumeros
         */
        //int qnt = RetornarPosicaoNumeros.retornarValor(53, 1953786);
        //int qnt = RetornarPosicaoNumeros.retornarValor(78, 195378678);
        //System.out.println("Qnt: " + qnt);

        /**
         * OddOccurrencesInArray
         */
        /*
        int number_unpaired[] = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(OddOccurrencesInArray.solution(number_unpaired));
        */

        /**
         * maximunTime
         */
        // 20:44
        // HH:MM
        //System.out.println(MaximunHours.maximunHour(2,4,0,0));
        //System.out.println(MaximunHours.maximunHour(1,8,3,2));
        //System.out.println(MaximunHours.maximunHour(3,0,7,0));
        //System.out.println(MaximunHours.maximunHour(9,1,9,7));
        //System.out.println(MaximunHours.maximunHour(1,3,5,2));

        /**
         * distancia quadrada
         */

        //System.out.println(MaxDistance.distancia(1, 1, 2, 3));
        //System.out.println(MaxDistance.distancia(2, 4, 2, 4));
        //System.out.println(MaxDistance.distancia(1, 4, 1, 5));
        //System.out.println(MaxDistance.distancia(1, 4, 5, 2));

        /**
         * CyclicRotation
         */
        //int[] A = {3,8,9,7,6};
        //System.out.println(Arrays.toString(CyclicRotation.solution(A, 3)));

        /**
         * FrogImp
         */
        //System.out.println(FrogJmp.solution(10,85,30));

        /**
         * linkedList
         */
        //int[] A = {3,2,4,6,8,5,8,-1,4};
        //System.out.println(LinkedList.solution(A));

        /**
         * BitOneCount
         */
        //int A = 50;
        //int B = 124;
        //System.out.println(BitOneCount.solution(A, B));

        /**
         * WordCount
         */

        //System.out.println(WordCount.solution("indeeds"));
        //System.out.println(WordCount.solution("schoolteacher"));
        //System.out.println(WordCount.solution("london"));

        /**
         * CardGame
         */

        //System.out.println(CardGame.solution("A586QK","JJ653K"));

        /**
         * FormattingPhoneNumber
         */
//        System.out.println(FormattingPhoneNumber.solution("00-44  48 5555 8361"));
//        System.out.println(FormattingPhoneNumber.solution("0 - 22 1985--324"));
//        System.out.println(FormattingPhoneNumber.solution("555372654"));
//        System.out.println(FormattingPhoneNumber.solution("23567890987654"));
//        System.out.println(FormattingPhoneNumber.solution("00-22 56 8888 9453"));


        /**
         * CardsWar
         */

//        System.out.println(CardsWar.Solution("A586QK","JJ653K"));
//        System.out.println(CardsWar.Solution("23A84Q","K2Q25J"));
//        System.out.println(CardsWar.Solution("'AKQJT23456789'","'59K7JQT3246A8'"));

        /**
         * PlayList
         */

       /* System.out.println(PlayList.solution("my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b"));*/

        /**
         * wordmachine
         */

        /*System.out.println(WordMachine.solution("13 DUP 4 POP 5 DUP + DUP + -"));

        int[][] sample1 =
                {
                        {1, 1, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 1},
                        {1, 1, 1, 1, 1}
                };

        int[][] sample2 =
                {
                        {1, 1, 1, 1, 1, 1, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 0},
                        {1, 1, 0, 1, 0, 1, 1, 0},
                        {1, 1, 1, 1, 0, 1, 1, 0},
                        {1, 1, 1, 1, 1, 1, 1, 0},
                        {1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0}
                };

        int[][] sample3 =
                {
                        {0, 0, 0, 1, 1, 1, 1, 1, 1, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                        {1, 0, 0, 1, 0, 0, 0, 0, 1, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 0, 1, 0, 0, 1, 1},
                        {1, 1, 1, 1, 0, 1, 0, 0, 1, 1},
                        {1, 1, 1, 1, 0, 1, 0, 0, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 0, 1, 0, 0, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                };

        int[][] sample4 =
                {
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                        {0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1},
                        {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                };

        int[][] sample5 =
                {
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                        {0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1},
                        {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                };

        int[][] sample6 =
                {
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1},
                        {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1},
                        {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1},
                        {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1},
                        {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                };


*/
        /**
         * GCD
         */
        //int[] array = {2, 4, 6, 8, 10};
        //int[] array = {2, 4, 6, 5, 6, 7, 10, 12, 14};
        //System.out.println(GCD.generalizedGCD(5, array));
        //System.out.println(GCD.generalizedGCDPablo(5, array));

        /**
         * Amazon Fresh
         */
        /*List<Integer> arry1 = new ArrayList<>();
        arry1.add(1);
        arry1.add(2);

        List<Integer> arry2 = new ArrayList<>();
        arry2.add(3);
        arry2.add(4);

        List<Integer> arry3 = new ArrayList<>();
        arry3.add(1);
        arry3.add(-1);

        List<List<Integer>> list = new ArrayList<>();
        list.add(arry1);
        list.add(arry2);
        list.add(arry3);

        System.out.println(AmazonFresh.solution(3, list, 2));*/

/*



        int[] numeros = {1, 2, 3, 4};
        int[] combinacao = new int[4];
        //Pega os numero informado e adicona no array

        //Faz todas as combinacoes possiveis
        int indiceCombinacao = 0;
        for (int i = 0; i < numeros.length; i++) {
            combinacao[0] = numeros[i];
            for (int j = 0; j < numeros.length; j++) {
                combinacao[1] = numeros[j];
                for (int k = 0; k < numeros.length; k++) {
                    combinacao[2] = numeros[k];
                    indiceCombinacao++;
                }
                for (int k = 0; k < numeros.length; k++) {
                    combinacao[3] = numeros[k];
                    indiceCombinacao++;
                    System.out.println("Combinação " + indiceCombinacao + ": " + combinacao[0] + " - " + combinacao[1] + " - " + combinacao[2] + " - " + combinacao[3]);
                }
            }
        }
*/


        /**
         * SaddlePoint
         */

        int[][] sample1 =
                {
                        {0, 1, 9, 3},
                        {7, 5, 8, 3},
                        {9, 2, 9, 4},
                        {4, 6, 7, 1}
                };

        System.out.println(SaddlePoint.solution(sample1));

    }


}




