package Chapter5_Reference_Type;

public class Refer_ex3 {
    public static void main(String[] args) {
        int[] students = new int[5];
        students[0] = 60;
        students[1] = 58;
        students[2] = 75;
        students[3] = 85;
        students[4] = 74;
        int sum = 0;
        int average = 0;
        for(int i = 0; i < students.length; ++i){
            sum += students[i];
        }
        average = sum / students.length;
        System.out.println(average);
    }
}
