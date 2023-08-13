package p1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Rule implements ActionListener {
Login login;
JFrame f;
JLabel head;
JLabel body;
JButton start;
JButton back;

public Rule(Login login) {
	this.login=login;
}
public void createwindow() {
	JFrame f = new JFrame();
	head = new JLabel("welcome to quiz game");
	head.setBounds(200,20,350,50);
	head.setFont(new Font("mv boli",Font.BOLD,28));
	body = new JLabel();
	body.setBounds(20,90,550,300);
	//body.setBorder(BorderFactory.createLineBorder(Color.blue));
	body.setText(
			"<html>"+
	        "1. you have 15 sec for each question attempt"+"<br><br>"+
			"2. there is only one correct option for each question"+"<br><br>"+
	        "3. There is no negative mark " +"<br><br>"+
			"4. 10 point for each correct answer"
			);
	body.setFont(new Font("Georgia",Font.BOLD,18));
	body.setForeground(Color.decode("#7812F3"));
	start = new JButton("Start");
	start.setBounds(200,350,125,35);
    start.setBackground(Color.decode("#45F807"));
    start.setForeground(Color.black);
	start.setFocusable(false);
	start.addActionListener(this);
	back = new JButton("back");
	back.setBounds(400,350,125,35);
    back.setBackground(Color.decode("#F3281E"));
    back.setForeground(Color.black);
	back.setFocusable(false);
	back.addActionListener(this);
	f.setVisible(true);
	f.setSize(700,500);
	f.setLayout(null);
	f.setIconImage(login.icon2);
	f.setTitle("Rule of quiz game");
	f.getContentPane().setBackground(Color.white);
	f.add(head);
	f.add(body);
	f.add(start);
	f.add(back);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==back) {
		new Login();
	}
	if(e.getSource()==start) {
		
		Quiz q = new Quiz();
	}
}
}
