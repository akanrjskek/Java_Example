package Chapter11_Collections;

import java.util.HashSet;
import java.util.Iterator;

class Student{
    String student_name;
    int student_id;

    Student(String student_name, int student_id){
        this.student_name = student_name;
        this.student_id = student_id;
    }

    public boolean equals(Object o){
        Student s = (Student)o;
        if(this.student_name.equals(((Student) o).student_name) && this.student_id == ((Student) o).student_id){
            return true;
        }
        return false;
    }

    public int hashCode(){
        return (this.student_id + this.student_name).hashCode();
    }

    public String toString(){
        return "학생의 이름은 " + this.student_name + "이고 학번은 " + this.student_id + "입니다.";
    }

}

public class HashSet_Example3 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        boolean b1 = set.add(new Student("john",1));
        boolean b2 = set.add(new Student("john",1));
        System.out.println(b1);
        System.out.println(b2);
        Iterator<Student> I = set.iterator();
        while(I.hasNext()){
            System.out.println(I.next());
        }
    }
}
