package Chapter12_Generics;

import java.util.List;
import java.util.ArrayList;

class Generics_Class<T>{
    private List<T> list;

    Generics_Class(){
        list = new ArrayList<>();
    }

    void addMethod(T t){
        list.add(t);
    }

    void printT(){
        for(int i = 0; i < list.size(); ++i){
            System.out.println(list.get(i).toString());
        }
    }
}

class Parent{
    Parent(){}
    public String toString(){
        return "Parent";
    }
}

class Child extends Parent{
    Child(){}
    public String toString(){
        return "Child";
    }
}

public class Generics_Example4 {
    public static void main(String[] args) {
        Generics_Class<Parent> gc = new Generics_Class<>();
        gc.addMethod(new Parent());
        gc.addMethod(new Child());
        gc.printT();
    }
}
