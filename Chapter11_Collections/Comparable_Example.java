package Chapter11_Collections;

import java.util.Arrays;

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
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


public class Comparable_Example {
    public static void main(String[] args) {
        Point[] p = new Point[5];
        p[0] = new Point(5,1);
        p[1] = new Point(4,1);
        p[2] = new Point(4,2);
        p[3] = new Point(3,3);
        p[4] = new Point(5,2);
        Arrays.sort(p);
        for(int i = 0; i < p.length; ++i){
            System.out.println(p[i]);
        }
    }
}
