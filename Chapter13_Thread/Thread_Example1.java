package Chapter13_Thread;

class Inheritace_Class extends Thread{
    public void run(){
        for(int i = 0; i < 3; ++i){
            System.out.println("Thread Class");
        }
    }
}

class Implements_Class implements Runnable{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Runnable Interface");
        }
    }
}

public class Thread_Example1 {
    public static void main(String[] args) {
        Thread t1 = new Inheritace_Class();
        Runnable runnable = new Implements_Class();
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    }
}
