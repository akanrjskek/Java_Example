package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    int rank;
    String name;

    Employee(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    int getRank(){
        return this.rank;
    }
}

public class Stream_Example16 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(1,"john"),
                new Employee(1, "terry"),
                new Employee(2, "jimmy"),
                new Employee(2, "jerry"),
                new Employee(3, "chris"),
                new Employee(3, "tom"));

        Map<Integer, List<Employee>> map = list.stream()
                .collect(Collectors.groupingBy(Employee::getRank));
        List<Employee> rank1 = map.get(1);
        List<Employee> rank2 = map.get(2);
        List<Employee> rank3 = map.get(3);

        for(Employee e : rank1){
            System.out.println("rank1: " + e.name);
        }

        for(Employee e : rank2){
            System.out.println("rank2: " + e.name);
        }

        for(Employee e : rank3){
            System.out.println("rank3: " + e.name);
        }
    }
}
