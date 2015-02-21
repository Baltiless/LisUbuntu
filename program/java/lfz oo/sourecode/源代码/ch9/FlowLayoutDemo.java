//: FlowLayoutDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame{
	private JButton left, center, right;
	private Container c;
	
	public FlowLayoutDemo(){
		super("FlowLayoutDemo");
		
		c = getContentPane();
		
		//�������ʽ���ò��֣�JFrame���������ȱʡ����ΪBorderLayout
		c.setLayout(new FlowLayout(FlowLayout.LEFT));	
			
		left = new JButton("Left");
		left.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//ͨ�������ť�������ò���
				c.setLayout(new FlowLayout(FlowLayout.LEFT));
				//֪ͨ���£��������ʽ���ã��򿴲���Ч��
				c.validate();
			}
		});
		//�������ӵ�������
		c.add(left);
		
		center = new JButton("Center");
		center.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setLayout(new FlowLayout(FlowLayout.CENTER));
				c.validate();
			}
		});
		c.add(center);
		
		right = new JButton("Right");
		right.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setLayout(new FlowLayout(FlowLayout.RIGHT));
				c.validate();
			}
		});
		c.add(right);
	}
	
	public static void main(String[] args){
		FlowLayoutDemo app = new FlowLayoutDemo();
		
		app.setSize(300, 100);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}