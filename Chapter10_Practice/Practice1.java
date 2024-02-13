package Chapter10_Practice;

class Clone implements Cloneable{
    public Clone clone() throws CloneNotSupportedException{
        return (Clone)super.clone();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        try{
            Clone c = new Clone();
            Clone c_c = c.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}