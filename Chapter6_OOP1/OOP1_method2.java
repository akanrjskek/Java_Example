package Chapter6_OOP1;

public class OOP1_method2 {
    public static double plus(double d1, double d2){
        return d1 + d2;
    }

    public static double minus(double d1, double d2){
        return d1 - d2;
    }

    public static double multi(double d1, double d2){
        return d1 * d2;
    }

    public static double divide(double d1, double d2){
        return d1 / d2;
    }


    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 5.0;
        System.out.printf("%f + %f = %f\n",d1,d2,plus(d1,d2));
        System.out.printf("%f - %f = %f\n",d1,d2,minus(d1,d2));
        System.out.printf("%f * %f = %f\n",d1,d2,multi(d1,d2));
        System.out.printf("%f / %f = %f\n",d1,d2,divide(d1,d2));
    }
}
