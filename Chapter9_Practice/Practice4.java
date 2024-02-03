package Chapter9_Practice;

public class Practice4 {
    public static void main(String[] args) {
        try{
            for(int i = 0; i < 10; ++i){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        catch(Exception e){
            for(int i = 0; i < 10; ++i){
                System.out.print(i * 2 + " ");
            }
            System.out.println();
        }
        finally {
            for(int i = 0; i < 10; ++i){
                System.out.print(i * 3 + " ");
            }
            System.out.println();
        }
    }
}
