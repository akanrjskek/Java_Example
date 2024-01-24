import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class P1 implements Comparable<P1>{
    int x;
    int y;

    P1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return this.x + " " + this.y;
    }

    public int compareTo(P1 p){
        return this.y - p.y;
    }
}

class P2{
    int x;
    int y;

    P2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return this.x + " " + this.y;
    }
}

public class Main {
    public static void main(String[] args){
        P1[] arr1= new P1[3];
        arr1[0] = new P1(1,0);
        arr1[1] = new P1(5,3);
        arr1[2] = new P1(4,2);

        P2[] arr2= new P2[3];
        arr2[0] = new P2(1,0);
        arr2[1] = new P2(5,3);
        arr2[2] = new P2(4,2);
        Arrays.sort(arr1);

        for(P1 p : arr1){
            System.out.println(p.toString());
        }

        System.out.println();

        Arrays.sort(arr2, new Comparator<P2>() {
            @Override
            public int compare(P2 p1, P2 p2){
                return p2.y - p1.y;
            }
        });

        for(P2 p : arr2){
            System.out.println(p.toString());
        }
    }
}