package Chapter11_Practice;

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
        if(this.student_name.equals(((Student) o).student_name)){
            return true;
        }
        return false;
    }

    public int hashCode(){
        return this.student_name.hashCode();
    }

    public String toString(){
        return "학생의 이름은 " + this.student_name + "이고 학번은 " + this.student_id + "입니다.";
    }

}

public class Practice2 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("john",1));
        set.add(new Student("Tom",2));
        set.add(new Student("Kane",3));
        set.add(new Student("Samuel",4));
        set.add(new Student("Diane",5));
        set.add(new Student("Tom",6));
        set.add(new Student("Kane",7));
        Iterator<Student> I = set.iterator();
        while(I.hasNext()){
            System.out.println(I.next());
        }
    }
}
