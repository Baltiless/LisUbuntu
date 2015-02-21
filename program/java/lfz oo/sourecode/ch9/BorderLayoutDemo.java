//: BorderLayoutDemo.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame{
    //�����������д����һ��෴
    public final static boolean RIGHT_TO_LEFT = false;
	
	private Container pane;
    
    public BorderLayoutDemo() {
        super("BorderLayoutDemo");
        
        pane = getContentPane();

        //���ô��ҵ�������
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }
		
		/*�Ѱ�ť���е���Ӧλ��*/
        JButton button = new JButton("Button 1 (PAGE_START)");
        pane.add(button, BorderLayout.PAGE_START);

        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.CENTER);

        button = new JButton("Button 3 (LINE_START)");
        pane.add(button, BorderLayout.LINE_START);

        button = new JButton("Long-Named Button 4 (PAGE_END)");
        pane.add(button, BorderLayout.PAGE_END);

        button = new JButton("5 (LINE_END)");
        pane.add(button, BorderLayout.LINE_END);
    }

    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
