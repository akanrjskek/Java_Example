package Chapter11_Collections;

import java.util.LinkedList;
import java.util.List;

public class List_Example4 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < 10; ++i){
            list.add(i + 1);
        }

        for(int i = 0; i < 10; ++i){
            System.out.println("list.get(" + i + ") : " + list.get(i));
        }

        list.add(11);
    }
}