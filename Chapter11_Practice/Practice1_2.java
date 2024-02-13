package Chapter11_Practice;

import java.util.HashSet;
import java.util.Iterator;

public class Practice1_2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("john");
        set.add("kane");
        set.add("jerry");
        set.add("kane");
        Iterator<String> I = set.iterator();
        while(I.hasNext()){
            System.out.println(I.next());
        }
    }
}

