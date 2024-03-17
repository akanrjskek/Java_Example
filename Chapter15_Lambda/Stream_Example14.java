package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    int student_id;
    String student_name;

    Student(){}
    Student(int student_id, String student_name){
        this.student_id = student_id;
        this.student_name = student_name;
    }
}

public class Stream_Example14 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<String> strList = intList.stream().map(Integer::toBinaryString).
                collect(Collectors.toList());
        List<Student> stuList = Arrays.asList(
                new Student(1,"John"),
                new Student(2,"Tom"),
                new Student(3, "Jerry"));
        System.out.println(strList);
        Map<Integer, Student> stuMap = stuList.stream().collect(Collectors.toMap(s -> s.student_id, s -> s));
        stuMap.forEach((k,v) -> System.out.println("key: " + k + " value: " + v.student_name));
    }
}
