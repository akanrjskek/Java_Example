package Chapter14_IO;

import java.io.*;

public class IO_Example7 {
    public static void main(String[] args) {
        try{
            FileInputStream input = new FileInputStream("C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\original.txt");
            FileOutputStream output = new FileOutputStream("C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\copy.txt");
            BufferedInputStream in = new BufferedInputStream(input);
            BufferedOutputStream out = new BufferedOutputStream(output);
            int Byte = 0;
            int data;
            long ctime = System.currentTimeMillis();
            while((data = in.read()) != -1){
                out.write(data);
                Byte++;
            }
            long time = System.currentTimeMillis();
            in.close();
            out.close();
            System.out.println("복사된 배열의 크기: " + Byte);
            System.out.println("복사 하는데 걸린 시간: "+(time - ctime));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
