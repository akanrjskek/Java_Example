package Chapter6_OOP1;

public class OOP1_Car_main1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(0);
        c.setAngle(0);
        c.setGear('P');
        System.out.println("c의 속도는 " + c.getSpeed() + "km/h, 각도는 " + c.getAngle() + "도, 기어는 " + c.getGear() + "입니다.");
        c.setGear('D');
        c.setSpeed(20);
        System.out.println("c의 속도는 " + c.getSpeed() + "km/h, 각도는 " + c.getAngle() + "도, 기어는 " + c.getGear() + "입니다.");
    }
}
