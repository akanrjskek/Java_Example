package Chapter13_Thread;

public class Thread_Example7 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while(true){
                        System.out.println("run");
                        Thread.sleep(1);
                    }
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }

                System.out.println("t end");
            }
        });

        t.start();
        t.interrupt();
    }
}
