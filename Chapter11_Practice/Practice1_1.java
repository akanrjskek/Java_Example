package Chapter11_Practice;

import java.util.ArrayList;
import java.util.List;

public class Practice1_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("diane");
        list.add("kane");
        list.add("jerry");
        list.add(1,"Tom");
        list.add(0,"samuel");
        list.remove(3);

        System.out.println(list);
    }
}
