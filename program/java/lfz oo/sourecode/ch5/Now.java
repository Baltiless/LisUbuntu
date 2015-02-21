//: Now.java 1.0 03/06/03

//package g3ds.joop.ch5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DateFormat;

class Now extends JFrame {
	JLabel label;
	DateFormat formatter;
	java.util.Date date;
	Container c;
	
	public Now() {
		c=getContentPane();
		label=new JLabel("Show time here.",JLabel.CENTER);
		
		c.add(label);
		
		formatter=DateFormat.getTimeInstance(DateFormat.LONG);
		
		//���ô���Timer����ļ��Ϊ1��
		int delay = 1000;
		//��дʱ�¼������������ݣ�������һ��������
  		ActionListener taskPerformer = new ActionListener() {
      		public void actionPerformed(ActionEvent evt) {
      			//�ѷ��صĵ�ǰʱ���ʽ��
				date=new java.util.Date(System.currentTimeMillis());
          		//����JLabel����չʾ
          		label.setText(formatter.format(date));
      		}
  		};
  		
  		//����javax.swing.Timer����
  		new Timer(delay, taskPerformer).start();
		
		//�رճ������ش���
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		System.out.println("Starting Now...");
		Now mainFrame = new Now();
		mainFrame.setBounds(150,150,150,100);
		mainFrame.setTitle("Now Time");
		mainFrame.setVisible(true);
	}
}