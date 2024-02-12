package Chapter13_Thread;

public class Thread_Example2 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                throwException();
            }

            public void throwException(){
                try{
                    throw new Exception();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        t.run();
    }
}
