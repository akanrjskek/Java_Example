import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n - 1 - i; ++j){
                sb.append(" ");
            }
            for(int j = 0; j < i + 1; ++j){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
