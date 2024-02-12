package Chapter14_IO;

import java.io.*;

public class IO_Example8 {
    public static void main(String[] args) {
        try{
            FileReader input= new FileReader("C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\input.txt");
            FileWriter output = new FileWriter("C:\\Users\\01082\\eclipse-workspace\\java_example\\src\\Chapter14_IO\\output.txt");
            BufferedReader br = new BufferedReader(input);
            BufferedWriter bw = new BufferedWriter(output);;
            String data;
            while((data = br.readLine()) != null){
                bw.write(data);
                bw.newLine();
            }
            br.close();
            bw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
