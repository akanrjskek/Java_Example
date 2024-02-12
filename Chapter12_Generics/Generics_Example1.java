package Chapter12_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics_Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        char[] c = null;

        for(int i = 0; i < list.size(); ++i){
            c = list.get(i).toCharArray();
        }

        System.out.println(Arrays.toString(c));
    }
}
