package Chapter11_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        boolean b1 = set.add("String");
        boolean b2 = set.add("String1");
        boolean b3 = set.add("String2");
        boolean b4 = set.add("String");
        Iterator<String> I = set.iterator();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        for(String s : set){
            System.out.println(s);
        }
        while(I.hasNext()){
            System.out.println(I.next());
        }
    }
}
