package Chapter6_OOP1;

class Class{
    int instance_variable;
    static int class_variable;

    void method(int v){
        int local_variable = v;
        System.out.println("local_variable = " + v);
    }
}

public class OOP_variable1 {
    public static void main(String[] args) {
        Class c1 = new Class();
        Class c2 = new Class();
        c1.instance_variable = 5;
        c2.instance_variable = 7;
        c1.class_variable = 10;
        System.out.println("instance_variable = " + c1.instance_variable + " instance_variable = " + c2.instance_variable + ", c1's class_variable = " + c1.class_variable + ", c2's class_variable = " + c2.class_variable);
        c2.class_variable = 20;
        c1.instance_variable = 15;
        c2.instance_variable = 25;
        System.out.println("instance_variable = " + c1.instance_variable + " instance_variable = " + c2.instance_variable + ", c1's class_variable = " + c2.class_variable + ", c2's class_variable = " + c2.class_variable);
        c1.method(30);
        c2.method(40);
    }
}
