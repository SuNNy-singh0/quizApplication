package p1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {
JLabel sc,point;
JButton restart;
public Score(int n) {
	this.setTitle("Quiz Application");
	setBounds(0,0,650,400);
	setLayout(null);
	getContentPane().setBackground(Color.white);
	sc= new JLabel("Thanks for giving quiz");
	sc.setBounds(130,50,300,40);
	sc.setFont(new Font("Tahoma",Font.PLAIN,25));
	add(sc);
	point= new JLabel("your score is "+n);
	point.setBounds(170,100,300,40);
	point.setFont(new Font("Tahoma",Font.PLAIN,25));
	add(point);
	Image icon2 = new ImageIcon("D:/logo.png").getImage();
    setIconImage(icon2);
	  restart = new JButton("Restart");
	    restart.setBounds(160,150,120,30);
	    restart.setFocusable(false);
	    restart.setBackground(Color.CYAN);
	    restart.setForeground(Color.black);
	    restart.addActionListener(this);
	    add(restart);
	setVisible(true);

	
}
	public static void main(String[] args) {
		new Score(0);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==restart) {
	 setVisible(false);
	 new Login();
	}

	}
}
