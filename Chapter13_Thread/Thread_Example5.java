package Chapter13_Thread;

import java.time.LocalTime;

public class Thread_Example5 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                LocalTime t;
                for(int i = 0; i < 5; ++i){
                    t = LocalTime.now();
                    System.out.println(t);
                    try{
                        Thread.sleep(5000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });

        t.start();
    }
}
