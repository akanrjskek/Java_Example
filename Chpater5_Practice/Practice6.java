package Chpater5_Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] a = new Integer[5];
        for(int i = 0; i < 5; ++i){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
