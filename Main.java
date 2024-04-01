import java.util.ArrayList;
import java.util.List;

class P implements Comparable<P>{
    int x, y;

    P(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x : " + this.x + " y : " + this.y;
    }

    @Override
    public int compareTo(P o) {
        return this.x - o.x;
    }
}

public class Main {
    public static void main(String[] args){
        List<P> list = new ArrayList<>();
        list.add(new P(1,2));
        list.add(new P(2,4));
        list.add(new P(3,6));
        list.add(new P(2,3));
        list.add(new P(1,1));
        list.sort(null);
        System.out.println(list);
    }
}