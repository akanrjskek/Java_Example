package Chapter6_OOP1;

public class Phone_main2 {
    public static void main(String[] args) {
        Phone p1;
        Phone p2;
        p1= new Phone();
        p2= new Phone();
        p1.model = "iphone";
        p2.model = "galaxy";
        p1.power = true;
        p2.power = false;
        p1.battery = 100;
        p2.battery = 90;
        System.out.println("p1의 모델은 " + p1.model + "이고 " + "배터리는 " + p1.battery + "%입니다.");
        System.out.println("p2의 모델은 " + p2.model + "이고 " + "배터리는 " + p2.battery + "%입니다.");
        p2 = p1;
        System.out.println("p1의 모델은 " + p1.model + "이고 " + "배터리는 " + p2.battery + "%입니다.");
        p1.battery = 80;
        System.out.println("p2의 모델은 " + p2.model + "이고 " + "배터리는 " + p2.battery + "%입니다.");
    }
}
