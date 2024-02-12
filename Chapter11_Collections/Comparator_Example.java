package Chapter11_Collections;

import java.util.Arrays;
import java.util.Comparator;

class P implements Comparable<P> {
    int x, y;

    P(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(P p) {
        if(this.x > p.x) {
            return 1;
        }
        else if(this.x == p.x) {
            if(this.y < p.y) {
                return 1;
            }
        }
        return -1;
    }

    public String toString(){
        return "x : " + this.x + " y : " + this.y;
    }
}

class ComparatorP implements Comparator{
    public int compare(Object o1, Object o2) {
        P p1 = (P)o1;
        P p2 = (P)o2;
        if(p1.x == p2.x){
            return p1.y - p2.y;
        }
        return p2.x - p1.x;
    }
}

public class Comparator_Example {
    public static void main(String[] args) {
        P[] p = new P[5];
        p[0] = new P(5,1);
        p[1] = new P(4,1);
        p[2] = new P(4,2);
        p[3] = new P(3,3);
        p[4] = new P(5,2);
        Arrays.sort(p,new ComparatorP());
        for(int i = 0; i < p.length; ++i){
            System.out.println(p[i]);
        }
    }
}
