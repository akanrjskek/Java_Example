package Chapter14_Practice;

import java.io.FileWriter;

public class Practice1 {
    public static void main(String[] args) {
        String file = "C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\test.txt";
        char[] c = {'h','e','l','l','o','w','o','r','l','d'};


        try{
            FileWriter fo = new FileWriter(file);
            int ch;
            int i = 0;
            while(i != 10 && (ch = c[i]) != -1){
                fo.write(c[i]);
                i += 1;
            }
            System.out.println();
            fo.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}