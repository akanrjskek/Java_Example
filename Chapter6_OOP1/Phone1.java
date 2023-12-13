package Chapter6_OOP1;

public class Phone1 {
    String model;
    boolean power;
    int battery;

    void power(){
        power = !power;
    }

    void model(String m){
        model = m;
    }

    void battery(int b){
        battery = b;
    }
}
