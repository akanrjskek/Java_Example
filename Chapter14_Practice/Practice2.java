package Chapter14_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input = "";
            while(!(input = bf.readLine()).equals("")){
                sb.append(input + "\n");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}

