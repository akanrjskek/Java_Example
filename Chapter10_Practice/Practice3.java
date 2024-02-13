package Chapter10_Practice;

class Student{
    String student_name;
    int student_id;

    Student(String student_name, int student_id){
        this.student_name = student_name;
        this.student_id = student_id;
    }

    public boolean equals(Object o){
        Student s = (Student)o;
        if(this.student_id == s.student_id && this.student_name.equals(student_name)){
            return true;
        }
        return false;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Student s1 = new Student("james", 1);
        Student s2 = new Student("james", 1);
        System.out.println(s1.equals(s2));
    }
}
