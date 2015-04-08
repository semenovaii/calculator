package calculator;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class CalcPanel extends JPanel implements ActionListener {
	String num1="";
	String num2="";
	String operator_="";
	boolean usingFirst=true;
	double total=0;
	JTextField display;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b0;
	JButton bdec;
	JButton bclear;
	JButton bequals;
	JButton bplus;
// начало вставки кода	
	JButton bminus;
	JButton bmultiply;
	JButton bdivide;
// окончание вставки
	
	public CalcPanel()
	{
		this.setBackground(Color.white);
		setLayout(null);
		display=new JTextField();

		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdec=new JButton(".");
		bclear=new JButton("C");
		bequals = new JButton( "=");
		bplus=new JButton("+");
// начало вставки кода			
		bminus = new JButton("-");    
		bmultiply = new JButton("*");   
		bdivide = new JButton("/");    	
// окончание вставки кода
		
		display.setBounds(0,0,235,50);
		
		b1.setBounds(0,200,50,50);
		b2.setBounds(50,200,50,50);
		b3.setBounds(100,200,50,50);
		bplus.setBounds(154,200,80,50);

		b4.setBounds(0,150,50,50);
		b5.setBounds(50,150,50,50);
		b6.setBounds(100,150,50,50);
// начало вставки кода		
		bminus.setBounds(154,150,80,50); 
// окончание вставки кода
		
		b7.setBounds(0,100,50,50);
		b8.setBounds(50,100,50,50);
		b9.setBounds(100,100,50,50);
// начало вставки кода			
		bmultiply.setBounds(154,100,40,50); 
		bdivide.setBounds(194,100,40,50);
// окончание вставки кода
		
		b0.setBounds(0,250,50,50);
		bdec.setBounds(50,250,50,50);
		bclear.setBounds(100,250,50,50);
		bequals.setBounds(154,250,80,50);
			
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(bdec);
		add(display);
		add(bclear);
		add(bequals);
		add(bplus);
// начало вставки кода			
		add(bminus);
		add(bmultiply);
		add(bdivide);
// окончание вставки кода		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bequals.addActionListener(this);
		bplus.addActionListener(this);
		bclear.addActionListener(this);
		bdec.addActionListener(this);
// начало вставки кода			
		bminus.addActionListener(this);
		bmultiply.addActionListener(this);
		bdivide.addActionListener(this);
// окончание вставки кода			
		
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		if(s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||
			s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||
			 s.equals("9")||s.equals("0")||s.equals("."))
		{
			if(usingFirst)
			{
		
				num1=num1+s;
				display.setText(num1);
			}
			else
			{
				num2=num2+s;
				display.setText(num2);
			}
		}
		if(s.equals("+"))
		{
			usingFirst=false;
			operator_="+";
		}
// начало вставки кода				
		if(s.equals("-"))	
		{
			usingFirst=false;
			operator_="-";
		}
		if(s.equals("*"))	
		{
			usingFirst=false;
			operator_="*";
		}
		if(s.equals("/"))	
		{
			usingFirst=false;
			operator_="/";
		}
		
		if(s.equals("="))
		{
			
			switch(operator_.charAt(0)){
			case '+':
				total=Double.parseDouble(num1)+Double.parseDouble(num2);
				display.setText( ""+total );
				break;
// начало вставки кода					
			case '-':
				total=Double.parseDouble(num1)-Double.parseDouble(num2);
				display.setText( ""+total );
				break;
			case '*':
				total=Double.parseDouble(num1)*Double.parseDouble(num2);
				display.setText( ""+total );
				break;
			case '/':	
				if(Double.parseDouble(num2)!=0) {
					total=Double.parseDouble(num1)/Double.parseDouble(num2);
					display.setText( ""+total );
				}
				else
					display.setText( "Делить на 0 нельзя");
				break;				
			}
// окончание вставки кода			

			usingFirst=true;
			num1="";
			num2="";
			operator_="";
		}
		if(s.equals("C"))
		{
			display.setText( "" );
			usingFirst=true;
			num1="";
			num2="";
			total=0;
		}
	}
}
