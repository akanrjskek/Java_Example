package project.departmentstore;

public class Customer extends Person{
    long consumption;
    static int customer_index = 0;
    int index;
    Customer(String name, long consumption){
        super(name);
        this.consumption = consumption;
        index = customer_index;
        customer_index += 1;
    }

    public String toString(){
        return "[" + getName() + ", " + index + "]";
    }
}
