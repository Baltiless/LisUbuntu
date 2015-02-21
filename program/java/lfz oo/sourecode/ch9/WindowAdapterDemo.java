//: WindowAdapterDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowAdapterDemo extends JFrame{
	public WindowAdapterDemo(){
		super("WindowAdapterDemo");
		
		Container c = getContentPane();
      
		JLabel label = new JLabel("WindowAdapter Here", JLabel.CENTER);
		c.add(label);
		
		//ʹ����������ķ�ʽ
		addWindowListener(new WindowAdapter(){
			//ֻ��д����Ȥ�ķ���
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	public static void main(String[] args){
		WindowAdapterDemo app = new WindowAdapterDemo();
		
		app.setBounds(100, 100, 200, 100);
		app.setVisible(true);
	}
}