package Chapter11_Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example1 {
    public static void main(String[] args) {
        Map<String, String> id_pass = new HashMap<>();
        id_pass.put("hello","0000");
        id_pass.put("world","1111");
        id_pass.put("abcde","2222");

        String s = "world";

        if(id_pass.containsKey("world")){
            System.out.println("해당 아이디는 존재합니다.");
        }

        else{
            System.out.println("해당 아이디는 존재하지 않습니다.");
        }
    }
}
