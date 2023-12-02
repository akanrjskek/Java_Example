package Chapter5_Reference_Type;

import java.util.Scanner;

public class Refer_ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        int max_value = 0;
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; ++i){
            if(max_value < arr[i]){
                max_value = arr[i];
            }
        }
        System.out.println(max_value);
    }
}
