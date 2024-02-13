package Chapter10_Practice;

import static java.lang.Math.*;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{
            addExact(x,y);
        }
        catch (ArithmeticException e){
            System.out.println(("오버플로우가 발생하였습니다."));
        }
    }
}
