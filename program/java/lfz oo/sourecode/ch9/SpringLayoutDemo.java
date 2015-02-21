//: SpringLayoutDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpringLayoutDemo extends JFrame{
	private Container c;
    public SpringLayoutDemo() {
		super("SpringLayoutDemo");
		
        c = getContentPane();
        
        SpringLayout layout = new SpringLayout();
        c.setLayout(layout);

		JLabel label = new JLabel("Label: ");
		JTextField textField = new JTextField("Text field", 15);
		c.add(label);
		c.add(textField);

        //������ǩ������֮���λ�ã�ʹ֮λ��(5,5).
        layout.putConstraint(SpringLayout.WEST, label,
                             5,
                             SpringLayout.WEST, c);
        layout.putConstraint(SpringLayout.NORTH, label,
                             5,
                             SpringLayout.NORTH, c);

        //�����ı���ͱ�ǩ֮���λ�ã�ʹ֮λ�ڣ���ǩ�ұ�+ 5, 5).
        layout.putConstraint(SpringLayout.WEST, textField,
                             5,
                             SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, textField,
                             5,
                             SpringLayout.NORTH, c);

        //�����������: ʹ֮�ұ߽���ı���5���أ�������ױ�5����
        layout.putConstraint(SpringLayout.EAST, c,
                             5,
                             SpringLayout.EAST, textField);
        layout.putConstraint(SpringLayout.SOUTH, c,
                             5,
                             SpringLayout.SOUTH, textField);
    }

	public static void main(String[] args) {
        SpringLayoutDemo frame = new SpringLayoutDemo();
        
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
