package Chpater5_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int find;
        for(int i = 0; i < 5; ++i){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        find = sc.nextInt();
        int index = Arrays.binarySearch(a, find);
        System.out.println(index);
    }
}
