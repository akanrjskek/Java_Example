package Chapter10_Package;

class Clone implements Cloneable{
    public Clone clone() throws CloneNotSupportedException{
        return (Clone)super.clone();
    }
}

public class Clone_Example1 {
    public static void main(String[] args) {
        try{
            Clone c = new Clone();
            Clone c_c = c.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println("Cloneable 인터페이스를 구현하세요.");
        }
    }
}
