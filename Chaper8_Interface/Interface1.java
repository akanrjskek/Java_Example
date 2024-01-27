package Chaper8_Interface;

interface Ainterface{
    int num = 5;
    abstract public void printmethod();
}

class Aclass implements Ainterface{
    public void printmethod(){
        System.out.println("This is Aclass");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Aclass a = new Aclass();
        System.out.println(a.num);
        a.printmethod();
    }
}
