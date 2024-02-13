package Chapter11_Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Example3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[10];

        for(int i = 0; i < 10; ++i){
            list.add(i + 1);
            arr[i] = i + 1;
        }

        for(int i = 0; i < 10; ++i){
            System.out.println("list.get(" + i + ") : " + list.get(i) + " arr[" + i + "] : " + arr[i]);
        }

        list.add(11);
        arr[10] = 11;
    }
}
