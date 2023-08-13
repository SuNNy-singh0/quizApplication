package p1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login implements ActionListener{
    JFrame frame;
    JLabel label;
    JLabel heading;
    JLabel Name;
    JTextField name;
    JButton rule;
    JButton back;
    Image icon2;
    JButton hello;
    Rule r;
	public static void main(String[] args) {
	new Login();
	}
   public Login() {
	   frame = new JFrame();
	  r = new Rule(this);
	  createframe(); 
   }
   public void createframe() {
	ImageIcon  icon = new ImageIcon("D:/h.png");
	label = new JLabel(icon);
	heading = new JLabel("welcome to quiz game");
	Name = new JLabel("Enter your Name");
	name = new JTextField();
	hello = new JButton("real");
	frame.add(hello); 
	rule = new JButton("Rule");
    back =  new JButton("Back");
    back.setBounds(500,250,75,50);
	back.setFont(new Font("Arial",Font.BOLD,12));
	back.setBackground(Color.cyan);
	back.setBorder(BorderFactory.createLineBorder(Color.black));
	back.setFocusable(false);
    back.setForeground(Color.blue);
    back.addActionListener(this);
    name.setBounds(380,200,150,25);
	name.setFont(new Font("Serif",Font.BOLD,18));
	frame.setLayout(null);
	rule.setBounds(380,250,75,50);
	rule.setFont(new Font("Arial",Font.BOLD,12));
	rule.setBackground(Color.GREEN);
	rule.setBorder(BorderFactory.createLineBorder(Color.black));
	rule.setFocusable(false);
    rule.setForeground(Color.blue);
    rule.addActionListener(this);
	Name.setFont(new Font("Serif",Font.BOLD,25));
	Name.setBounds(350,150,300,60);
    //Name.setBorder(BorderFactory.createLineBorder(Color.black));
    Name.setForeground(Color.black);
    frame.getContentPane().setBackground(Color.white);
	   label.setOpaque(false);
    frame.add(name);
	frame.add(Name);
	frame.add(label);
	frame.add(heading);
	frame.add(rule);
	frame.add(back);
	 icon2 = new ImageIcon("D:/logo.png").getImage();
	frame.setIconImage(icon2);
	heading.setFont(new Font("Viner Hand ITC",Font.BOLD,35));
	heading.setBounds(150,70,400,60);
   // heading.setBorder(BorderFactory.createLineBorder(Color.blue));
    heading.setForeground(Color.MAGENTA);
	frame.pack();
	
	label.setBounds(30, 130, 300, 200);
    //label.setBorder(BorderFactory.createLineBorder(Color.blue));
	   frame.add(label);
	   frame.setSize(700,500);
	   frame.setTitle("Quiz Application");   
	   
	  // Image backgroundImage = new ImageIcon("d:/kbc.jpg").getImage();
	   frame.setVisible(true);
	   frame.setLayout(null);
	 
	   }
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==rule) {
		frame.dispose();
		r.createwindow();
	}
	if(e.getSource()==back) {
		frame.dispose();
	}
	
}
}
