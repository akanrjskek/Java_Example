package Chapter12_Generics;

import java.util.ArrayList;
import java.util.List;

class WildParent{
    String s;

    WildParent(String s){
        this.s = s;
    }

    public String toString(){
        return this.s;
    }
}

class WildChild extends WildParent{

    WildChild(String s){
        super(s);
    }

    public String toString(){
        return super.s;
    }
}

class WildClass{

    public static String print(List<? extends WildParent> list){
        String s = "";
        for(WildParent wild : list){
            s += wild + " ";
        }
        return s.trim();
    }
}

public class Generics_Example8 {
    public static void main(String[] args) {
        List<WildParent> list1 = new ArrayList<WildParent>(){{
            add(new WildParent("parent1"));
            add(new WildChild("child1"));
            add(new WildParent("parent2"));
        }};
        List<WildChild> list2 = new ArrayList<WildChild>(){{
            add(new WildChild("child1"));
            add(new WildChild("child2"));
            add(new WildChild("child3"));
        }};
        System.out.println(WildClass.print(list1));
        System.out.println(WildClass.print(list2));
    }
}
