package Chpater5_Practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int min_value = Integer.MAX_VALUE;
        for(int i = 0; i < 10; ++i){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; ++i){
            if(a[i] < min_value){
                min_value = a[i];
            }
        }

        System.out.println(min_value);
    }
}
