package Chapter14_IO;

import java.io.FileWriter;

public class IO_Example3 {
    public static void main(String[] args) {
        String file = "C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\test.txt";
        char[] c = new char[10];
        c[0] = 'e';
        c[1] = 'n';
        c[2] = 'g';
        c[3] = 'l';
        c[4] = 'i';
        c[5] = 's';
        c[6] = 'h';
        c[7] = '\n';
        c[8] = '한';
        c[9] = '글';

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
