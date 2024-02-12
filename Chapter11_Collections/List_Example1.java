package Chapter11_Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Example1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>(15);
        List<Integer> list4 = new ArrayList<>(list3);
    }
}
