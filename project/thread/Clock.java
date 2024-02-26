package project.thread;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class Clock extends JFrame implements Runnable{
    private Thread thread;
    private JLabel label;
    private JPanel jp;

    public Clock(){
        super("디지털 시계");
        jp = new JPanel();
        label = new JLabel();
        this.add(jp);
        jp.add(label);
        jp.setPreferredSize(new Dimension(700,250));
        label.setFont(new Font("함초롱바탕",Font.PLAIN, 40));
        label.setHorizontalAlignment(JLabel.CENTER);
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Clock();
    }

    public void run(){
        String now = "";
        while(true){
            Calendar cal = Calendar.getInstance();
            now = cal.get(Calendar.YEAR)+"년 "+
                    (cal.get(Calendar.MONTH)+1)+"월 "+
                    cal.get(Calendar.DATE)+"일 "+
                    cal.get(Calendar.HOUR)+"시 "+
                    cal.get(Calendar.MINUTE)+"분 "+
                    cal.get(Calendar.SECOND)+"초";
            label.setText(now);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
