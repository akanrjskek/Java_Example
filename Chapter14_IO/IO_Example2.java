package Chapter14_IO;

import java.io.FileReader;

public class IO_Example2 {
    public static void main(String[] args) {
        String file = "C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\test.txt";
        try{
            FileReader fi = new FileReader(file);
            int ch;
            while((ch = fi.read()) != -1){
                System.out.print((char) ch);
            }
            System.out.println();
            fi.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
