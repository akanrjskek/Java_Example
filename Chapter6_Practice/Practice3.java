package Chapter6_Practice;

public class Practice3 {

    public static int method(int a, int b){
        return a + b;
    }

    public static double method(double a, double b){
        return a + b;
    }

    public static String method(String a, String b){
        return a + b;
    }

    public static String method(String a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(method(1,2));
        System.out.println(method(1.0,1));
        System.out.println(method("1",3));
        System.out.println(method("1","2"));
    }
}
