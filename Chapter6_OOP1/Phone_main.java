package Chapter6_OOP1;

class Phone {
    String model;
    boolean power;
    int battery;

    void power(){power = !power;}
    void model(String m){model = m;}
    void battery(int b){battery = b;}
}

public class Phone_main {
    public static void main(String[] args) {
        Phone p;
        p= new Phone();
        p.model = "iphone";
        p.power = true;
        p.battery = 100;
        System.out.println("p의 모델은 " + p.model + "이고 " + "배터리는 " + p.battery + "%입니다.");
        p.battery = 90;
        p.model("galaxy");
        System.out.println("p의 모델은 " + p.model + "이고 " + "배터리는 " + p.battery + "%입니다.");
    }
}
