package project.departmentstore;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String getName(){
        return this.name;
    }
}
