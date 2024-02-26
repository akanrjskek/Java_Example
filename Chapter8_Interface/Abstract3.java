package Chapter8_Interface;

abstract class Car {
    boolean go;
    double power;
    abstract void wheel();
    abstract void move(double power);

    void stop(){
        this.go = false;
        power = 0.0;
    }
}

class Truck extends Car {
    void wheel(){
        System.out.println("트럭의 바퀴는 4개입니다.");
    }

    void move(double power){
        this.power = power * 5;

    }
}

class ElectricBicycle extends Car {
    void wheel(){
        System.out.println("자전거의 바퀴는 2개입니다.");
    }

    void move(double power){
        this.power = power * 2;
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        Car c1 = new Truck();
        Car c2 = new ElectricBicycle();
        c1.wheel();
        c2.wheel();
        c1.move(1.0);
        c2.move(2.0);
        c1.stop();
        c2.stop();
    }
}
