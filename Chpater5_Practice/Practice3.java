package Chpater5_Practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        double average = 0.0;
        for(int i = 0; i < 5; ++i){
            a[i] = sc.nextInt();
            average += a[i];
        }
        System.out.println("average = " + average / 5);
    }
}
