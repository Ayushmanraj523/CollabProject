package ATM_Machine;

import javax.swing.*;

public class ATMLogin  {
    public static void main(String[] args) {
        
        // create frame 
        JFrame f=new JFrame();
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JLabel l=new JLabel("Wellcome to ATM Machine");
        l.setBounds(50, 10, 200, 30);
        f.add(l);

        JPasswordField p=new JPasswordField();
        p.setBounds(50, 50, 70, 30);
        f.add(p);

        JButton b=new JButton("Login");
        b.setBounds(50, 100, 80, 30);
        f.add(b);

        JButton b2=new JButton("Exit");
        b2.setBounds(160, 100, 80, 30);
        f.add(b2);

        JCheckBox c=new JCheckBox();
        c.setBounds(50, 60, 20, 20);
        f.add(c);

        f.setVisible(true);

    }

    
}
