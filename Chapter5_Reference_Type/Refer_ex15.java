package Chapter5_Reference_Type;

import java.util.Arrays;

public class Refer_ex15 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i * arr1[i].length + j + 1;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%3d",arr1[i][j]);
            }
            System.out.println();
        }
    }
}
