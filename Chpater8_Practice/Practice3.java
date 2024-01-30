package Chpater8_Practice;

abstract class ElectronicProduct{
    boolean power;
    String name;

    ElectronicProduct(String name) {
        this.name = name;
    }

    void powerSwitch(){
        this.power = !this.power;
    }

    String productName(){
        return name;
    }

    void print(){
        if(this.power){
            System.out.println(productName() + "의 전원이 켜져있습니다.");
        }
        else{
            System.out.println(productName() + "의 전원이 꺼져있습니다.");
        }
    }
}

class Computer extends ElectronicProduct{
    Computer(String name){
        super(name);
    }
}

class Tv extends ElectronicProduct{
    Tv(String name){
        super(name);
    }
}

class VaccumCleaner extends ElectronicProduct{
    VaccumCleaner(String name){
        super(name);
    }
}

public class Practice3 {
    public static void main(String[] args) {
        ElectronicProduct computer = new Computer("컴퓨터");
        ElectronicProduct tv = new Tv("텔레비전");
        ElectronicProduct vc = new VaccumCleaner("청소기");
        computer.powerSwitch();
        tv.powerSwitch();
        //vaccumcleaner.powerSwitch();
        computer.print();
        tv.print();
        vc.print();
    }
}
