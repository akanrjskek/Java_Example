package project.departmentstore;

import java.util.List;

public class StoreSystem {
    public <T> void register(Management<? extends Person> management, T t) {
        List<T> people;
        people = (List<T>)management.getpeopleList();
        people.add(t);
    }

    public static void printManagementPeople(Management<? extends Person> management) {
        System.out.println(management.getName() + ": " + management.getpeopleList().toString());
    }
}
