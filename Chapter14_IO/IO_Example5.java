package Chapter14_IO;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class IO_Example5 {
    public static void main(String[] args) {
        try{
            FileOutputStream fo = new FileOutputStream("C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\test.txt");
            Writer writer = new OutputStreamWriter(fo);
            String s = "english\n한글";
            writer.write(s);
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
