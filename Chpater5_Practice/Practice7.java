package Chpater5_Practice;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int sum_value = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                sum_value += a[i][j];
            }
        }

        System.out.println(sum_value);
    }
}
