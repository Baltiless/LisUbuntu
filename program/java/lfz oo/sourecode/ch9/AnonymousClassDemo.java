//: AnonymousClassDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassDemo extends JFrame{
	private Button b;
	
	public AnonymousClassDemo(){
		super("AnonymousClassDemo");
		
		Container c = getContentPane();
		
		b = new Button("Quit");
		//�����������ʽ
		b.addActionListener(new ActionListener(){
			//ʵ�ּ������ӿڵķ���
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		c.add(b, BorderLayout.CENTER);
	}

	public static void main(String[] args){
		AnonymousClassDemo app = new AnonymousClassDemo();
		
		app.pack();
		app.setVisible(true);
	}
}