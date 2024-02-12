package Chapter12_Generics;

import java.util.List;
import java.util.ArrayList;

interface Interface{}

class Parent_extends implements Interface{
    Parent_extends(){}

    public String toString(){
        return "Parent";
    }
}

class Child_extends extends Parent_extends {
    Child_extends(){}

    public String toString(){
        return "Child";
    }
}


class Extends<T extends Parent_extends & Interface>{
    List<T> list;

    Extends(){
        list = new ArrayList<>();
    }

    void addMethod(T t){
        list.add(t);
    }

    void printMethod(){
        for(T t : list){
            System.out.println(t);
        }
    }
}

public class Generics_Example6 {
    public static void main(String[] args) {
        Extends<Parent_extends> e = new Extends<>();
        e.addMethod(new Parent_extends());
        e.addMethod(new Child_extends());
        e.printMethod();
    }
}
