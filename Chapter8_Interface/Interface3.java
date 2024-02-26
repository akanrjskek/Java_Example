package Chapter8_Interface;

class Soccer implements Sports {
    private int player;

    Soccer(int player){
        this.player = player;
    }

    public int gp(){
        return this.player;
    }

    public Sports method(){
        return null;
    }

    public String toString(){
        return "soccer";
    }

    public Sports sports(int players){
        if(this.player == 11){
            return this;
        }
        return null;
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Sports s = new Soccer(10);
        if(s.sports(s.gp()) != null){
            System.out.println(s);
        }
        else{
            System.out.println("other sports");
        }
    }
}
