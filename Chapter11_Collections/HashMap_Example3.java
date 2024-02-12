package Chapter11_Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMap_Example3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("student1",80);
        map.put("student2",56);
        map.put("student3",97);
        map.put("student4",64);
        map.put("student5",100);

        double average = 0;
        int max_value = 0;
        int min_value = Integer.MAX_VALUE;
        String max_student = null;
        String min_student = null;

        Set set = map.entrySet();

        for(Object o: set){
            Map.Entry<String,Integer> e = (Map.Entry) o;
            average += e.getValue();
            if(max_value < e.getValue()){
                max_value = e.getValue();
                max_student = String.valueOf(e.getKey());
            }

            if(min_value > e.getValue()){
                min_value = e.getValue();
                min_student = String.valueOf(e.getKey());
            }
        }

        average = average / map.size();

        System.out.println("평균 점수는 " + average + "점 입니다.");
        System.out.println(max_student + "이 최고 점수 " + max_value + "점을 받았습니다.");
        System.out.println(min_student + "이 최하 점수 " + min_value + "점을 받았습니다.");
    }
}
