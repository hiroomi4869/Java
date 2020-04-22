import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class StartSet {
    public static void main(String[] args) throws IOException {
        long interval = 1000;//在这里改每过多少时间刷新一天 单位ms
        Bank bank=new Bank("ChinaBank",0.065);
        testAcount testAcount=new testAcount(bank);
        bank.createUser("hiroomi","123");
        bank.userTools("10120190001").topUp( 1000);
        bank.userTools("10120190001").getInfo("123");
        bank.userTools("10120190001").withdraw(100,"123");
        bank.userTools("10120190001").changeName("123","eric");
        bank.userTools("10120190001").changePassword("123","321");
        bank.userTools("10120190001").getInfo("321");
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("D:\\java\\Java\\src\\Java\\Week5\\bank.txt"));
        oos.writeObject(bank);

        Timer timer = new Timer();
        JFrame jFrame = new JFrame();

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ListModel listModel=new DefaultListModel();
        JTextArea jTextArea=new JTextArea();
        jTextArea.setLineWrap(true);
        jFrame.add(jTextArea);
        jFrame.setSize(750,1000);
        jFrame.setLayout(new GridLayout(1,1,1,1));
        jFrame.setVisible(true);
        Thread thread1=new Thread();
        thread1.start();
        thread1.run();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ArrayList<String> list=  bank.refresh();
                String out="";
                for (String s:list) {
                    out=out+s+"\n";
                }
                jTextArea.setText(out);

            }
        },3000,interval);
    }
}
