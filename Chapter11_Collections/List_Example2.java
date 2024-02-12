package Chapter11_Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Example2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("john");
        list.add("tom");
        list.add("james");
        list.add(2,"new face");
        System.out.println(list.get(0));
        System.out.println(list);

        list.set(0,"hun");
        System.out.println(list);

        System.out.println("hun은 해당 list에 존재하나요? " + list.contains("hun"));

        list.remove(1);
        System.out.println(list);
    }
}
