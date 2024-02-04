package Chapter10_Package;

class PhoneNumber{
    String number;
    String mobilecarrier;

    PhoneNumber(String number, String mobilecarrier){
        this.number = number;
        this.mobilecarrier = mobilecarrier;
    }
}

class CellPhone implements Cloneable{
    PhoneNumber p;
    String model;

    CellPhone(PhoneNumber p, String model){
        this.p = p;
        this.model = model;
    }

    public CellPhone sCopy() throws CloneNotSupportedException{
        return (CellPhone)super.clone();
    }

    public CellPhone dCopy() throws CloneNotSupportedException{
        CellPhone c = (CellPhone)super.clone();
        c.p = new PhoneNumber(this.p.number, this.p.mobilecarrier);
        return c;
    }
}

public class Clone_Example2 {
    public static void main(String[] args){
        try{
            CellPhone c1 = new CellPhone(new PhoneNumber("010-0000-1111","KT"),"Galaxy");
            CellPhone c2 = c1.sCopy();
            CellPhone c3 = c1.dCopy();

            System.out.println("c1: " + c1.p.number + " " + c1.p.mobilecarrier);
            System.out.println("c2: " + c2.p.number + " " + c2.p.mobilecarrier);
            System.out.println("c3: " + c3.p.number + " " + c3.p.mobilecarrier);

            c1.p.number = "010-1111-2222";
            c1.p.mobilecarrier = "SKT";

            System.out.println("c1: " + c1.p.number + " " + c1.p.mobilecarrier);
            System.out.println("c2: " + c2.p.number + " " + c2.p.mobilecarrier);
            System.out.println("c3: " + c3.p.number + " " + c3.p.mobilecarrier);
        }
        catch(CloneNotSupportedException e){
            System.out.println("Cloneable 인터페이스가 구현되지 않았습니다.");
        }

    }
}