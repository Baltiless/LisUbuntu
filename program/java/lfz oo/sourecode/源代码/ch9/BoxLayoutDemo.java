//: BoxLayoutDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxLayoutDemo extends JFrame{
	private Container c;
	private JButton button;
	
	
	public BoxLayoutDemo(){
        super("BoxLayoutDemo");
        
        c = getContentPane();
        //����ΪBoxLayout����Y��������
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        button = new JButton("Button 1");
        //������þ��ж��뷽ʽ
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.add(button);
        
        button = new JButton("Button 2");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.add(button);
        
        button = new JButton("Button 3");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.add(button);
    }
	
	public static void main(String[] args) {
        BoxLayoutDemo frame = new BoxLayoutDemo();
        
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}