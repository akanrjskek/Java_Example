package Chapter5_Reference_Type;

import java.util.Scanner;

public class Refer_ex6 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        double average = 0.0;
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        average = sum / a.length;
        if(average >= 70){
            System.out.println(average + "점으로 합격입니다.");
        }
        else{
            System.out.println(average + "점으로 불합격입니다.");
        }

    }
}
