package Chapter14_IO;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class IO_Example4 {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\test.txt");
            Reader reader = new InputStreamReader(fi);
            char[] chars = new char[10];
            int num = reader.read(chars);
            reader.close();
            for(int i = 0; i < num; ++i){
                System.out.print(chars[i]);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
