package Chapter15_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    int class_num;
    String name;

    Student(int class_num, String name){
        this.class_num = class_num;
        this.name = name;
    }

    int getClass_num(){
        return this.class_num;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(1,"tom"),
                new Student(3,"jerry"),
                new Student(2,"jimmy"),
                new Student(4,"john"),
                new Student(3,"terry"),
                new Student(1,"tim"));

        Map<Integer, List<Student>> map = list.stream()
                .collect(Collectors.groupingBy(Student::getClass_num));
        List<Student> class1 = map.get(1);
        List<Student> class2 = map.get(2);
        List<Student> class3 = map.get(3);
        List<Student> class4 = map.get(4);

        for(Student s : class1){
            System.out.println("class1: "+s.name);
        }
        for(Student s : class2){
            System.out.println("class2: "+s.name);
        }
        for(Student s : class3){
            System.out.println("class3: "+s.name);
        }
        for(Student s : class4){
            System.out.println("class4: "+s.name);
        }
    }
}
