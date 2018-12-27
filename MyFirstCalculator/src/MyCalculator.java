    import java.applet.*;
	import java.awt.event.*;
	import java.awt.*;
	/*
	<applet code="Calculator" width=500 height=300>
	</applet>
	*/
	public class MyCalculator extends Applet implements ActionListener
	{
	
		private static final long serialVersionUID = 1L;
	String msg="";
	int num1,num2,result;
	TextField T1;
	Button NumButtons[]=new Button[10];
	Button Add,Sub,Mul,Div,clear,Mod,EQ;
	char op;
	Panel nPanel,cPanel,sPanel;
	public void init()
	{
	nPanel=new Panel();
	T1=new TextField(30);
	nPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	nPanel.add(T1);
	cPanel=new Panel();
	cPanel.setBackground(Color.orange);
	cPanel.setLayout(new GridLayout(5,5,3,3));
	for(int i=0;i<10;i++)
	{
	NumButtons[i]=new Button(""+i);
	}
	Add=new Button("+");
	Sub=new Button("-");
	Mul=new Button("*");
	Div=new Button("/");
	Mod=new Button("%");
	clear=new Button("clear");
	EQ=new Button("=");
	T1.addActionListener(this);
	for(int i=0;i<10;i++)
	{
	cPanel.add(NumButtons[i]);
	}
	cPanel.add(Add);
	cPanel.add(Sub);
	cPanel.add(Mul);
	cPanel.add(Div);
	cPanel.add(Mod);
	cPanel.add(EQ);
	sPanel=new Panel();
	sPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	sPanel.setBackground(Color.red);
	sPanel.add(clear);
	for(int i=0;i<10;i++)
	{
	NumButtons[i].addActionListener(this);
	}
	Add.addActionListener(this);
	Sub.addActionListener(this);
	Mul.addActionListener(this);
	Div.addActionListener(this);
	Mod.addActionListener(this);
	clear.addActionListener(this);
	EQ.addActionListener(this);
	this.setLayout(new BorderLayout());
	add(nPanel,BorderLayout.NORTH);
	add(cPanel,BorderLayout.CENTER);
	add(sPanel,BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent ae)
	{
	String str=ae.getActionCommand();
	char ch=str.charAt(0);
	if(Character.isDigit(ch))
	T1.setText(T1.getText()+str);
	else
	if(str.equals("+"))
	{
	num1=Integer.parseInt(T1.getText());
	op='+';
	T1.setText("");
	}
	else if(str.equals("-"))
	{
	num1=Integer.parseInt(T1.getText());
	op='-';
	T1.setText("");
	}
	else if(str.equals("*"))
	{
	num1=Integer.parseInt(T1.getText());
	op='*';
	T1.setText("");
	}

	else if(str.equals("/"))
	{
	num1=Integer.parseInt(T1.getText());
	op='/';
	T1.setText("");
	}
	else if(str.equals("%"))
	{
	num1=Integer.parseInt(T1.getText());
	op='%';
	T1.setText("");
	}

	if(str.equals("="))
	{
	num2=Integer.parseInt(T1.getText());
	switch(op)
	{
	case'+':
	result=num1+num2;
	break;

	case'-':
	result=num1-num2;
	break;

	case'*':
	result=num1*num2;
	break;

	case'/':
	result=num1/num2;
	break;

	case'%':
	result=num1%num2;
	break;
	}
	T1.setText(""+result);
	}
	if(str.equals("clear"))
	{
	T1.setText("");
	}
	}
	}

