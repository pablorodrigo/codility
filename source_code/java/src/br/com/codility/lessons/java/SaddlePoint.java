package br.com.codility.lessons.java;

public class SaddlePoint {

    /*public static int solution(int[][] A){
        for (int i = 0; i < A.length; i++)
        {


            int rowMin = A[i][0];

            int colIndex = 0;

            boolean saddlePoint = true;

            //Finding the smallest element in ith row

            for (int j = 1; j < A[i].length; j++)
            {



                System.out.println(A[i][j]);

                if(A[i][j] < rowMin)
                {
                    rowMin = A[i][j];


                    colIndex = j;
                }
            }


            //Checking rowMin is also the largest element in its column

            for (int j = 0; j < A.length; j++)
            {
                if(A[j][colIndex] > rowMin)
                {
                    System.out.println(rowMin);
                    saddlePoint = false;

                    break;
                }
            }

            if(saddlePoint)
            {
                System.out.println("Saddle Point is : "+rowMin);
            }
        }
        return 0;
    }*/

    public static int solution(int[][] A) {
        // Process all rows one by one

        int result = 0;

        for (int row = 0; row < A.length - 1; row++) {

            if (row == 0 || row == A.length - 1)
                continue;

                // Find the minimum element of row row.
                // Also find column index of the minimum element
                int min_row = A[row][0], col_ind = 0;
            for (int column = 0; column < A[row].length - 1; column++) {

                if (column ==  A[row].length - 1 || column == 0)
                    continue;

                if (min_row > A[row][column]) {
                    min_row = A[row][column];
                    col_ind = column;
                }
            }

            // Check if the minimum element of row is also
            // the maximum element of column or not
            int k;
            for (k = 0; k < A[row].length - 1; k++)

                // Note that col_ind is fixed
                if (min_row < A[k][col_ind])
                    break;

            // If saddle point is present in this row then
            // print it
            if (k == A[row].length - 1) {
                System.out.println("Value of Saddle Point " + min_row);
                result++;
            } else {
                System.out.println("Is not Saddle Point " + min_row);
            }
        }

        // If Saddle Point not found
        //return false;
        return result;
    }


}
