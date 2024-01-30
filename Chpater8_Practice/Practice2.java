package Chpater8_Practice;

interface Calculable {
    double plus(double d1, double d2);
    double minus(double d1, double d2);
    double multi(double d1, double d2);
    double divide(double d1, double d2);
}

class Calculator implements Calculable {
    public double plus(double d1, double d2){
        return d1 + d2;
    }

    public double minus(double d1, double d2){
        return d1 - d2;
    }

    public double multi(double d1, double d2){
        return d1 * d2;
    }

    public double divide(double d1, double d2){
        return d1 / d2;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Calculable c = new Calculator();
        double d1 = 5.0;
        double d2 = 2.0;
        System.out.println(d1 + " + " + d2 + "= " + c.plus(d1,d2));
        System.out.println(d1 + " - " + d2 + "= " + c.minus(d1,d2));
        System.out.println(d1 + " * " + d2 + "= " + c.multi(d1,d2));
        System.out.println(d1 + " / " + d2 + "= " + c.divide(d1,d2));
    }
}
