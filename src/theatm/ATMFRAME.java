/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theatm;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author Inkall
 */
public class ATMFRAME extends JFrame implements ActionListener{
    JPanel p1,p2,p3,p4,p5,p6,pc,pd;
    JLabel l1,l2,l3,l4,l5,l6;
    JPasswordField a1;
    JButton bconfirm,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    JTextField t1,t2,t3,t4,t5,t6;
    
    public ATMFRAME()
    {
        this.setTitle("ATM");
        this.setVisible(true);
        this.setSize(650,480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,1));
        this.setResizable(false);
       
        p1=new JPanel(new GridLayout(2,1)); 
       p1.setBackground(Color.black);  JPanel pa = new JPanel();JPanel pb = new JPanel();
        pa.setBackground(Color.black);
         pb.setBackground(Color.black);
       l1=new JLabel("Username");
       l1.setForeground(Color.white);
       t1=new JTextField();
       t1.setColumns(20);
        t1.setBackground(Color.gray);
       t1.setForeground(Color.white);
       l2=new JLabel("Password"); l2.setForeground(Color.WHITE);
       a1=new JPasswordField();
        a1.setBackground(Color.gray);
       a1.setForeground(Color.white);
       a1.setColumns(20);
       bconfirm=new JButton("Submit");
      
       bconfirm.setBackground(Color.GREEN);
       pa.add(l1);pa.add(t1);pa.add(l2);pa.add(a1);
       pa.add(bconfirm);
       l4=new JLabel(" ");
      l4.setForeground(Color.BLUE);
       pb.add(l4);
       p1.add(pa);p1.add(pb);
       this.add(p1);
       
       
       p2=new JPanel();
       p2.setBackground(Color.black);
       l3= new JLabel("ENTER THE AMOUNT OF MONEY YOU WANT TO ADD/WITHDRAW");
       l3.setForeground(Color.white);
       t3= new JTextField();
       t3.setBackground(Color.gray);
       t3.setForeground(Color.white);
       t3.setColumns(40);  
       p2.add(l3);
       p2.add(t3);
       this.add(p2);
       
       p3=new JPanel();
     
       p3.setLayout(new GridLayout(2,5,3,3));
       p3.setBackground(Color.black);
       b1=new JButton("1");
       b1.setBackground(Color.gray);
       
      b1.setForeground(Color.white);
       b2=new JButton("2");
        b2.setBackground(Color.gray);
      b2.setForeground(Color.white);
       b3=new JButton("3");
        b3.setBackground(Color.gray);
      b3.setForeground(Color.white);
       b4=new JButton("4");
        b4.setBackground(Color.gray);
      b4.setForeground(Color.white);
       b5=new JButton("5");
        b5.setBackground(Color.gray);
      b5.setForeground(Color.white);
       b6=new JButton("6");
      b6.setBackground(Color.gray);
      b6.setForeground(Color.white);
       b7=new JButton("7");
      b7.setBackground(Color.gray);
      b7.setForeground(Color.white);
      b8=new JButton("8");
      b8.setBackground(Color.gray);
      b8.setForeground(Color.white);
      b9=new JButton("9");
      b9.setBackground(Color.gray);
      b9.setForeground(Color.white);
      b10=new JButton("0");
      b10.setBackground(Color.gray);
      b10.setForeground(Color.white);
       p3.add(b1);
       p3.add(b2);
       p3.add(b3); p3.add(b4); p3.add(b5); p3.add(b6); p3.add(b7); p3.add(b8); p3.add(b9); p3.add(b10); 
       this.add(p3);
       
       
     
     p4=new JPanel(new GridLayout(2, 1)); 
     pc=new JPanel();pc.setBackground(Color.black);
     pd=new JPanel();pd.setBackground(Color.black);
     b11=new JButton("Withdraw");
     b11.setBackground(Color.red);
     b12=new JButton("    ADD     "); b12.setBackground(Color.green);
     pc.add(b11); pc.add(b12);  
     l3=new JLabel("");
     pd.add(l3);
     p4.add(pc);
     p4.add(pd);
     this.add(p4);
   
     t1.addActionListener(this);a1.addActionListener(this);t3.addActionListener(this);
     b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
     b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
     b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
     b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
     bconfirm.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String s1; String s2 =a1.getText().toString();
           s1=t1.getText().toString();
          
         String  input = t3.getText();
        if (e.getSource()==bconfirm)
        {
            if(s2.equals("blabla2020")&&s1.equals("blablah"))
            {
             s1=t1.getText().toString();
             s2=a1.getText().toString();
            System.out.print("username: "+s1+"  "+s2);
            l4.setText("welcome  "+s1);
             l4.setForeground(Color.green);
            b1.setEnabled(true);b2.setEnabled(true);
            b3.setEnabled(true);b4.setEnabled(true);b5.setEnabled(true);b6.setEnabled(true);b7.setEnabled(true);b8.setEnabled(true);
            b9.setEnabled(true);b10.setEnabled(true);b11.setEnabled(true);b12.setEnabled(true);
            }
            else{
            t3.setEnabled(false);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);b7.setEnabled(false);b8.setEnabled(false);
            b9.setEnabled(false);b10.setEnabled(false);b11.setEnabled(false);b12.setEnabled(false);
             l4.setForeground(Color.red);
             l4.setText("please enter the correct username and password ");
             
            }
       
        }
       
        if(e.getSource()==b1)
        {
            t3.setText(input+b1.getText());
        }
        if(e.getSource()==b2)
        {
            t3.setText(input+b2.getText());
        }
        if(e.getSource()==b3)
        {
            t3.setText(input+b3.getText());
        }
        if(e.getSource()==b4)
        {
            t3.setText(input+b4.getText());
        }
        if(e.getSource()==b5)
        {
            t3.setText(input+b5.getText());
        }
         if(e.getSource()==b6)
        {
            t3.setText(input+b6.getText());
        }
        if(e.getSource()==b7)
        {
            t3.setText(input+b7.getText());
        }
        if(e.getSource()==b8)
        {
            t3.setText(input+b8.getText());
        }
        if(e.getSource()==b9)
        {
            t3.setText(input+b9.getText());
        }
        if(e.getSource()==b10)
        {
            t3.setText(input+b10.getText());
        }
        if(e.getSource()==b11)
        {
            s1=t1.getText();
            String a=t3.getText();
            l3.setForeground(Color.red);
            l3.setText("Hey, "+s1+" "+a+" pounds  withdrawed from your account");
        }
        if(e.getSource()==b12)
        {
            s1=t1.getText();
            String a=t3.getText();
            l3.setForeground(Color.GREEN);
            l3.setText("Hey, "+s1+" "+a+" pounds  added to your account");
        }
                
        
    }
}
