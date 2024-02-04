package Chapter10_Package;

class ToString{
    int a;

    ToString(int a){
        this.a = a;
    }
    
    public String toString(){
        return "이 객체의 a값은 " + this.a + "입니다.";
    }
}

public class ToString_Example1 {
    public static void main(String[] args) {
        ToString ts1 = new ToString(1);
        ToString ts2 = new ToString(2);
        System.out.println(ts1.toString());
        System.out.println(ts2.toString());
    }
}
