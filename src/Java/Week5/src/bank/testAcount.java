package Week5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class testAcount {

    public testAcount(Bank bank) {

        JFrame jf=new JFrame();
        JLabel out=new JLabel("总计");
        JLabel name= new JLabel("姓名");
        JTextField jn=new JTextField();
        JLabel p= new JLabel("密码");
        JTextField jp=new JTextField();
        JButton b=new JButton("开户");
        JButton d=new JButton("存款");
        jf.setLayout(new GridLayout(4,2,10,10));
        jf.setSize(400,200);
        jf.add(name);
        jf.add(jn);
        jf.add(p);
        jf.add(jp);
        jf.add(b);
        jf.add(b);
        jf.setDefaultCloseOperation(2);
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension screenSize=toolkit.getScreenSize();
        jf.setLocation(screenSize.width/2-200,screenSize.height/2-100);
        jf.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String cardId=bank.createUser(jn.getText(),jp.getText());
                jf.setVisible(false);
                JFrame nf=new JFrame();
                nf.setLayout(new GridLayout(4,2,10,10));
                nf.setSize(400,200);
                JButton d=new JButton("存款");
                JTextArea jt=new JTextArea();
                JButton f=new JButton("return");
                nf.add(d);
                nf.add(out);
                nf.add(jt);
                nf.add(f);
                nf.setLocation(screenSize.width/2-200,screenSize.height/2-100);
                nf.setVisible(true);
                d.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        bank.userTools(cardId).topUp(Double.parseDouble(jt.getText()));
                        jt.setText(bank.getBalance(cardId,jp.getText()).toString());

                    }});
                f.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nf.setVisible(false);
                        jf.setVisible(true);
                    }
                });
            }});
    }


}

