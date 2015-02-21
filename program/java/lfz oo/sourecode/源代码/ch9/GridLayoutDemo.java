//: GridLayoutDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame{
	private String[] name= {"1","2","3","4","5","6"};
	private JButton[] button = new JButton[name.length];
	
	private Container c;
	
	public GridLayoutDemo(){
		super("GridLayoutDemo");
		
		c = getContentPane();
		
		//���ò��ֹ�������������ָ������֤4�С���������������������
		c.setLayout(new GridLayout(0, 4, 10, 5));
		
		for (int i=0; i<name.length; i++){
			button[i] = new JButton(name[i]);
			c.add(button[i]);
		}
	}
	
	public static void main(String[] args) {
        GridLayoutDemo frame = new GridLayoutDemo();
        
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}