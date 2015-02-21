//: OuterClassDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OuterClassDemo extends JFrame{
	private Button b;
	
	public OuterClassDemo(){
		super("OuterClassDemo");
		
		Container c = getContentPane();
		
		b = new Button("Quit");
		//�ⲿ�������ʽ
		b.addActionListener(new QuitHandler());
		c.add(b, BorderLayout.CENTER);
	}

	public static void main(String[] args){
		OuterClassDemo app = new OuterClassDemo();
		
		app.pack();
		app.setVisible(true);
	}
}

class QuitHandler  implements ActionListener{
	//ʵ�ּ������ӿڵķ���
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
}