package Chapter13_Thread;

import java.time.LocalTime;

public class Thread_Example6 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50000000; ++i){}
                System.out.println("t1 Finish " + LocalTime.now());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50000000; ++i){}
                System.out.println("t2 Finish " + LocalTime.now());
            }
        });

        for(int i = 0; i < 50000000; ++i){}
        for(int i = 0; i < 50000000; ++i){}
        t1.start();
        t2.start();
        try{
            t2.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("main finish " + LocalTime.now());
    }
}
