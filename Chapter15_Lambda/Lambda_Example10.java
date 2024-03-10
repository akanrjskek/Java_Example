package Chapter15_Lambda;

import java.util.*;

public class Lambda_Example10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 5; ++i){
            list.add(i+1);
        }
        map.put("a",1);map.put("b",2);map.put("c",3);map.put("d",4);map.put("e",5);
        list.removeIf(i -> i%2 == 0);
        System.out.println(list);
        list.replaceAll(i -> i + 1);
        System.out.println(list);
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();
        map.compute("a", (k,v) -> v + 10);
        map.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));
    }
}
