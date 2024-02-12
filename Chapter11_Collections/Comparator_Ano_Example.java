package Chapter11_Collections;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_Ano_Example {
    public static void main(String[] args) {
        P[] p = new P[5];
        p[0] = new P(5,1);
        p[1] = new P(4,1);
        p[2] = new P(4,2);
        p[3] = new P(3,3);
        p[4] = new P(5,2);
        Arrays.sort(p, new Comparator<P>() {
            public int compare(P p1, P p2) {
                if(p1.x == p2.x){
                    return p1.y - p2.y;
                }
                return p2.x - p1.x;
            }
        });
        for(int i = 0; i < p.length; ++i){
            System.out.println(p[i]);
        }
    }
}