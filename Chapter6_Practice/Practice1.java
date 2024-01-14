package Chapter6_Practice;

class Student{
    static int studentsum = 0;
    static int studentnumber = 0;
    String name;
    String gender;
    int number;
    String phonenum;

    Student(){}

    Student(String name, String gender, String phonenum){
        studentsum += 1;
        studentnumber += 1;
        this.name = name;
        this.gender = gender;
        this.number = studentnumber;
        this.phonenum = phonenum;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Student[] students = new Student[30];
        students[Student.studentnumber] = new Student("john","man","010-0000-0001");
        students[Student.studentnumber] = new Student("jenny","woman","010-0000-0002");
        students[Student.studentnumber] = new Student("tom","man","010-0000-0003");
        System.out.println("name = " + students[0].name + " gender = " + students[0].gender + " studentnumber = " + students[0].number + " phonenumber = " + students[0].phonenum);
        System.out.println("name = " + students[1].name + " gender = " + students[1].gender + " studentnumber = " + students[1].number + " phonenumber = " + students[1].phonenum);
        System.out.println("name = " + students[2].name + " gender = " + students[2].gender + " studentnumber = " + students[2].number + " phonenumber = " + students[2].phonenum);
    }

}
