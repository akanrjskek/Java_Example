package Chapter6_Practice;

class Practice02{
    int num1 = 0;
    static int num2 = 0;
}

public class Practice2 {
    public static void main(String[] args) {
        Practice02 p1 = new Practice02();
        Practice02 p2 = new Practice02();
        p1.num1 += 1;
        p1.num2 += 1;
        System.out.println("p1.num1 = " + p1.num1 + " p1.num2 = " + p1.num2);
        p2.num1 += 1;
        p2.num2 += 1;
        System.out.println("p2.num1 = " + p2.num1 + " p2.num2 = " + p2.num2);}
}
