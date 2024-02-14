package project.departmentstore;

public class Worker extends Person{
    int index;
    static int worker_index = 0;
    Worker(String name){
        super(name);
        index = worker_index;
        worker_index += 1;
    }

    @Override
    public String toString(){
        return "[" + getName() + ", " + index + "]";
    }
}
