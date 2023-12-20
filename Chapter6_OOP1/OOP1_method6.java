package Chapter6_OOP1;

public class OOP1_method6 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(v.madein + " " + Vehicle.madein);
        v.madeIn("Korea");
        System.out.println(v.madein + " " + Vehicle.madein);
        Vehicle.madeIn("America");
        System.out.println(v.madein + " " + Vehicle.madein);
    }
}

