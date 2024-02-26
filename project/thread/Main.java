package project.thread;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements ActionListener{

    JLabel[] threads;
    JPanel jp;
    JButton startBtn;

    Main(){
        super("로또 번호 추첨");
        jp = new JPanel();
        threads = new JLabel[7];
        this.add(jp);
        jp.setPreferredSize(new Dimension(600,750));
        jp.setLayout(new FlowLayout(FlowLayout.CENTER));
        for(int i = 0; i < threads.length; ++i) {
            threads[i] = new JLabel("로또 번호 " + (i + 1));
            jp.add(threads[i]);
            threads[i].setFont(new Font("함초롱바탕",Font.PLAIN, 20));
            threads[i].setPreferredSize(new Dimension(380, 90));
            threads[i].setBackground(Color.white);
            threads[i].setOpaque(true);
        }

        startBtn = new JButton("Start!");
        startBtn.setPreferredSize(new Dimension(380,40));
        startBtn.addActionListener(this);
        jp.add(startBtn);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        Runnable[] runnables = new Runnable[7];
        Thread[] action_threads = new Thread[7];
        for(int i = 0; i < runnables.length; ++i){
            runnables[i] = new Thread_Lotto(threads[i]);
            action_threads[i] = new Thread(runnables[i]);
            action_threads[i].start();
        }

    }
}