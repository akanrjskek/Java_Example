package Chapter14_IO;

import java.util.Scanner;
public class Standard_Example1 {
    public static void main(String[] args) {
        int result = (int)(Math.random()*100)+1;
        int try_number = 0;
        Scanner sc;
        int cnt = 0;
        do{
            cnt++;
            try{
                Thread.sleep(1000);
                System.out.print("1과 100사이의 값을 입력하세요 :");
                sc = new Scanner(System.in);
                try_number = sc.nextInt();
                // Scanner클래스를 새로생성해서 다시 입력받도록 함
            }catch(Exception e){
                System.err.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
                continue;
            }
            if(try_number>result){
                System.out.println("더 작은 수를 입력하세요.");
            }else if(try_number<result){
                System.out.println("더 큰 수를 입력하세요.");
            }
            else{
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 "+cnt+"번입니다.");
                break;
            }
        }while(true);
    }
}
