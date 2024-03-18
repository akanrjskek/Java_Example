package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
    boolean student;
    String name;

    Person(boolean student, String name){
        this.student = student;
        this.name = name;
    }

    boolean isStudent(){
        return this.student;
    }
}

public class Stream_Example15 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person(true,"john"),
                new Person(true, "jerry"),
                new Person(false, "tom"),
                new Person(false, "jimmy"));
        Map<Boolean, List<Person>> map = list.stream()
                .collect(Collectors.partitioningBy(Person::isStudent));
        List<Person> student = map.get(true);
        List<Person> notStudent = map.get(false);

        for(Person p: student){
            System.out.println(p.name + ": student");
        }

        for(Person p: notStudent){
            System.out.println(p.name + ": not student");
        }
    }
}
