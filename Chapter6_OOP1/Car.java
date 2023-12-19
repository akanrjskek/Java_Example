package Chapter6_OOP1;

public class Car {
    int speed;
    double angle;
    char gear;

    public int getSpeed() {
        return speed;
    }

    public double getAngle() {
        return angle;
    }

    public char getGear() {
        return gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setGear(char gear) {
        this.gear = gear;
    }
}
