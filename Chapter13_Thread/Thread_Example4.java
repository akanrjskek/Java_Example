package Chapter13_Thread;

class Shared_Class{
    int a;

    Shared_Class(){}
    Shared_Class(int a){
        this.a = a;
    }

    public int getMethod(){
        return a;
    }

    public synchronized void setMethod(int a){
        this.a = a;
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("객체의 a값은 " + this.a + "입니다.");
    }
}

public class Thread_Example4 {
    public static void main(String[] args) {
        Shared_Class sc = new Shared_Class();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sc.setMethod(20);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sc.setMethod(50);
            }
        });

        t1.start();
        t2.start();
    }
}
