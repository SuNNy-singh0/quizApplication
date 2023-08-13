package p1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Quiz extends JFrame implements ActionListener{
 ImageIcon i1;
 JLabel qno; 
 JLabel ques;
 String questions[][] = new String[10][5];
 String answers[][] = new String[10][2];
 String useranswer[][] = new String[10][1];
 JRadioButton opt1,opt2,opt3,opt4;
 JLabel image;
 ButtonGroup group ;
 JButton next,submit;
 public static int timer = 10;
 public static int ans = 0;
 public static int count =0;
 public static int score =0;
 Quiz(){
	setBounds(0,0,900,700);
	getContentPane().setBackground(Color.white);
	setLayout(null);
	setTitle("welcome to quiz");
	i1 = new ImageIcon("D:/z.png");
	 image = new JLabel(i1);
	image.setOpaque(false);
	image.setBounds(0,0,800,300);
	add(image);
	Image icon2 = new ImageIcon("D:/logo.png").getImage();
    setIconImage(icon2);
	qno = new JLabel();
	qno.setBounds(50,320,50,30);
	qno.setFont(new Font("Tahoma",Font.PLAIN,25));
	add(qno);
	ques = new JLabel();
	ques.setBounds(90,320,700,30);
	ques.setFont(new Font("Tahoma",Font.PLAIN,19));
	add(ques);
	questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
    questions[0][1] = "JVM";
    questions[0][2] = "JDB";
    questions[0][3] = "JDK";
    questions[0][4] = "JRE";

    questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
    questions[1][1] = "int";
    questions[1][2] = "Object";
    questions[1][3] = "long";
    questions[1][4] = "void";

    questions[2][0] = "Which package contains the Random class?";
    questions[2][1] = "java.util package";
    questions[2][2] = "java.lang package";
    questions[2][3] = "java.awt package";
    questions[2][4] = "java.io package";

    questions[3][0] = "An interface with no fields or methods is known as?";
    questions[3][1] = "Runnable Interface";
    questions[3][2] = "Abstract Interface";
    questions[3][3] = "Marker Interface";
    questions[3][4] = "CharSequence Interface";

    questions[4][0] = "In which memory a String is stored, "
    		+ "when we create a string using new operator?";
    questions[4][1] = "Stack";
    questions[4][2] = "String memory";
    questions[4][3] = "Random storage space";
    questions[4][4] = "Heap memory";

    questions[5][0] = "Which of the following is a marker interface?";
    questions[5][1] = "Runnable interface";
    questions[5][2] = "Remote interface";
    questions[5][3] = "Readable interface";
    questions[5][4] = "Result interface";

    questions[6][0] = "Which keyword is used for accessing the features of a package?";
    questions[6][1] = "import";
    questions[6][2] = "package";
    questions[6][3] = "extends";
    questions[6][4] = "export";

    questions[7][0] = "In java, jar stands for?";
    questions[7][1] = "Java Archive Runner";
    questions[7][2] = "Java Archive";
    questions[7][3] = "Java Application Resource";
    questions[7][4] = "Java Application Runner";

    questions[8][0] = "Which of the following is a mutable class in java?";
    questions[8][1] = "java.lang.StringBuilder";
    questions[8][2] = "java.lang.Short";
    questions[8][3] = "java.lang.Byte";
    questions[8][4] = "java.lang.String";

    questions[9][0] = "Which of the following option leads to the portability and security of Java?";
    questions[9][1] = "Bytecode is executed by JVM";
    questions[9][2] = "The applet makes the Java code secure and portable";
    questions[9][3] = "Use of exception handling";
    questions[9][4] = "Dynamic binding between objects";
    
    answers[0][1] = "JDB";
    answers[1][1] = "int";
    answers[2][1] = "java.util package";
    answers[3][1] = "Marker Interface";
    answers[4][1] = "Heap memory";
    answers[5][1] = "Remote interface";
    answers[6][1] = "import";
    answers[7][1] = "Java Archive";
    answers[8][1] = "java.lang.StringBuilder";
    answers[9][1] = "Bytecode is executed by JVM";
    
    opt1 = new JRadioButton();
    opt1.setBounds(130,360,500,30);
    opt1.setBackground(Color.white);
    opt1.setFont(new Font("Dialog",Font.PLAIN,25));
    opt1.setFocusable(false);
    add(opt1);
    opt2 = new JRadioButton();
    opt2.setBounds(130,390,500,30);
    opt2.setBackground(Color.white);
    opt2.setFont(new Font("Dialog",Font.PLAIN,25));
    opt2.setFocusable(false);
    add(opt2);
   opt3 = new JRadioButton();
    opt3.setBounds(130,430,500,30);
    opt3.setBackground(Color.white);
    opt3.setFont(new Font("Dialog",Font.PLAIN,25));
    opt3.setFocusable(false);
    add(opt3);
    opt4 = new JRadioButton();
    opt4.setBounds(130,470,500,30);
    opt4.setBackground(Color.white);
    opt4.setFont(new Font("Dialog",Font.PLAIN,25));
    opt4.setFocusable(false);
    add(opt4);
   group = new ButtonGroup();
    group.add(opt1);
    group.add(opt2);
    group.add(opt3);
    group.add(opt4);
    next = new JButton("Next");
    next.setBounds(730,400,120,30);
    next.setFocusable(false);
    next.setBackground(Color.blue);
    next.setForeground(Color.white);
    next.addActionListener(this);
    add(next);
    submit = new JButton("Submit");
    submit.setBounds(730,450,120,30);
    submit.setFocusable(false);
    submit.setBackground(Color.CYAN);
    submit.setForeground(Color.black);
    submit.addActionListener(this);
    submit.setEnabled(false);
    add(submit);
    start(count);
	setVisible(true); 
	
 }
 public void paint(Graphics g) {
	 super.paint(g);
	 String time = "Time left - "+timer+"sec";
	  g.setColor(Color.RED);
	  g.setFont(new Font("Arial",Font.BOLD,26));
	  if(timer>0) {
		  g.drawString(time,650,400);
	  }
	  else{
		  g.drawString("Time over",650,400);
	  }
	  timer--;
	  try {
		  Thread.sleep(1000);
		  repaint();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  if(ans==1) {
		  ans=0;
		  timer=10;
		  
	  }
	  if(count==9&&timer==2) {
		  //submit button
		  if(group.getSelection()==null) {
				useranswer[count][0]="";  
			  }
			  else {
				  useranswer[count][0]= group.getSelection().getActionCommand();
			  }
		  for(int i=0;i<useranswer.length;i++) {
			  if(useranswer[i][0].equals(answers[i][1])) {
				  score+=10;
			  }
			  else {
				  score+=10;
			  }
		  }
		  setVisible(false);
		  new Score(score);
	  }
	  else if(timer<0) {
		  timer=10;
		  if(group.getSelection()==null) {
			useranswer[count][0]="";  
		  }
		  else {
			  useranswer[count][0]= group.getSelection().getActionCommand();
		  }
		  
		  start(count);
		  count++; 
	  }
 }
 public void start(int count) {
	 qno.setText(""+(count+1)+".");
	 ques.setText(questions[count][0]);
	 opt1.setText(questions[count][1]);
	 opt1.setActionCommand(questions[count][1]);
	 opt2.setText(questions[count][2]);
	 opt2.setActionCommand(questions[count][2]);
	 opt3.setText(questions[count][3]);
	 opt3.setActionCommand(questions[count][3]);
	 opt4.setText(questions[count][4]);
	 opt4.setActionCommand(questions[count][4]);
	 group.clearSelection();
	 }
public static void main(String[] args) {
	 new Quiz();
 }
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==next) {
		repaint();
		timer=10;
		ans=1;
		 if(group.getSelection()==null) {
				useranswer[count][0]="";  
			  }
			  else {
				  useranswer[count][0]= group.getSelection().getActionCommand();
			  }
		 if(count==8) {
			 next.setEnabled(false);
			 submit.setEnabled(true);
		 }
		 count++;
		 start(count);
	}
	else if(e.getSource()==submit) {
		  if(group.getSelection()==null) {
				useranswer[count][0]="";  
			  }
			  else {
				  useranswer[count][0]= group.getSelection().getActionCommand();
			  }
		  for(int i=0;i<useranswer.length;i++) {
			  if(useranswer[i][0].equals(answers[i][1])) {
				  score+=10;
			  }
			  else {
				  score+=0;
			  }
		  }
		  setVisible(false);
		  new Score(score);
	}
}
}
  