package Chapter7_OOP2;

import java.util.Scanner;

class O{
    private int a;
    private int b;

    private int getA(){
        return this.a;
    }

    private int getB(){
        return this.b;
    }

    private int logicA(int a){
        if(a < 0 || a > 10){
            this.a = 11;
            return this.a;
        }
        return a;
    }

    private int logicB(int b){
        if(b < 10 || b > 20){
            this.b = 9;
            return this.b;
        }
        return b;
    }

    public int choiceA(int a){
        this.a = logicA(a);
        return getA();

    }

    public int choiceB(int b){
        this.b = logicB(b);
        return getB();
    }
}

public class Overriding5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        O o = new O();
        int a = o.choiceA(11);
        int b = o.choiceB(9);
        while(0 >= a || a > 10){
            System.out.print("1 ~ 10 사이의 수를 입력하세요 : ");
            a = o.choiceA(sc.nextInt());
        }

        while(b < 10 || b > 20){
            System.out.print("11 ~ 20 사이의 수를 입력하세요 : ");
            b = o.choiceB(sc.nextInt());
        }
        System.out.println("a = " + a + " b = " + b);
    }
}
