package ua.artcode.week3;

/**
 * Created by Serhii Fursenko on 07.06.16.
 */
public class Task3_9 {

    /*
    3.9. Умножить две матрицы.
     */

    public static void main(String[] args) {

        int[][] matrix1 = MatrixUtils.genMatrix(2, 3);
        int[][] matrix2 = MatrixUtils.genMatrix(3, 4);
        int[][] result = multiplyMatrixs(matrix1,matrix2);

        System.out.println("Matrix #1");
        MatrixUtils.printMatrix(matrix1);
        System.out.println("-------------------");

        System.out.println("Matrix #2");
        MatrixUtils.printMatrix(matrix2);
        System.out.println("-------------------");

        System.out.println("Multiplied atrix");
        MatrixUtils.printMatrix(result);
        System.out.println("-------------------");

    }



    public static int[][] multiplyMatrixs(int[][] a, int[][] b) {

        if (a[0].length != b.length) {
            int[][] result = new int[1][1];
            return result;
        }

        int[][] result = new int[a.length][b[0].length];

        int newElement =0;

        for(int i=0; i< result.length; i++) {
            for(int j=0; j<result[0].length;j++) {
                newElement=0;
                for(int z =0; z<b.length;z++) {

                    newElement+= a[i][z]*b[z][j];
                }
                result[i][j]=newElement;
            }
        }

        return result;


    }


}


