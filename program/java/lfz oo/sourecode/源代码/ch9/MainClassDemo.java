//: MainClassDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainClassDemo extends JFrame implements ActionListener{
	private Button b;
	
	public MainClassDemo(){
		super("MainClassDemo");
		
		Container c = getContentPane();
		
		b = new Button("Quit");
		//���Ҽ�����ʽ
		b.addActionListener(this);
		c.add(b, BorderLayout.CENTER);
	}
	
	//ʵ�ּ������ӿڵķ���
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}

	public static void main(String[] args){
		MainClassDemo app = new MainClassDemo();
		
		app.pack();
		app.setVisible(true);
	}
}