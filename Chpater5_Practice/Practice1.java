package Chpater5_Practice;

public class Practice1 {
    public static void main(String[] args) {
        String s1 = "ab d";
        String s2 = "ab d";
        String s3 = "AB D";
        String s4 = new String("ab d");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }
}
