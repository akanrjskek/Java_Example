package project.thread;
import javax.swing.JLabel;

public class Thread_Lotto implements Runnable{
    int i=0;
    JLabel lb;
    Thread_Lotto(JLabel lb){
        this.lb = lb;
    }
    public void run(){
        while(i<100){
            try {
                Thread.sleep((int)(Math.random()*100));
                lb.setText("로또 번호 추첨 중        " + (int)((Math.random() * 45)));
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lb.setText("" + (int)((Math.random() * 45) + 1));
    }
}