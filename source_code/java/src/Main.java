import br.com.codility.lessons.FormattingPhoneNumber;
import br.com.codility.lessons.MaxDistance;

public class Main {

    public static void main(String[] args) {

        /**
         * BinaryGrap
         */
        //int intervalo = BinaryGrap.intervalorNumero(1040);
        //System.out.println("intervalor" + intervalo);

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
        System.out.println(FormattingPhoneNumber.solution("00-44  48 5555 8361"));
        System.out.println(FormattingPhoneNumber.solution("0 - 22 1985--324"));
        System.out.println(FormattingPhoneNumber.solution("555372654"));
        System.out.println(FormattingPhoneNumber.solution("23567890987654"));
        System.out.println(FormattingPhoneNumber.solution("00-22 56 8888 9453"));

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
    }


}




