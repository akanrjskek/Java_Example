package project.departmentstore;

import java.util.ArrayList;
import java.util.List;

public class Management<T extends Person> {
    private String name;
    private List<T> peopleList;

    public Management(String name) {
        this.name = name;
        peopleList = new ArrayList();
    }

    public String getName() {
        return name;
    }
    public List<T> getpeopleList(){
        return peopleList;
    }
}
