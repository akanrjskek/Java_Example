package Chapter11_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example1 {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        Iterator<Integer> it = hashset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
