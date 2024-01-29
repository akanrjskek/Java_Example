package Chpater8_Practice;

abstract class Car{
    int speed;
    String direction;
    int wheel;

    void go(){
        this.speed += 1;
    }

    void stop(){
        this.speed = 0;
    }

    void reverse(){
        this.speed -= 1;
    }

    void left(){
        this.direction = "left";
    }

    void right(){
        this.direction = "right";
    }

    abstract int wheels();
}

class Truck extends Car {

    int wheels(){
        return 4;
    }
    Truck(){
        this.wheel = wheels();
    }
}

class MotorCycle extends Car {
    int wheels(){
        return 2;
    }
    MotorCycle(){
        this.wheel = wheels();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Car truck = new Truck();
        Car motorcycle = new MotorCycle();
        System.out.println("truck's wheel = " + truck.wheels());
        System.out.println("motorcycle's wheel = " + motorcycle.wheels());
    }
}
