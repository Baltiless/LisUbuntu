//: ApplicationGUI.java

//package g3ds.joop.ch9;

/*���Swing GUI������3����ͨ������Ҫ����*/
//����Swing���ʱ
import javax.swing.*;
//����AWTһЩ�ײ����ʱ����Container
import java.awt.*;
//����AWT�¼�ʱ����������û���¼�����
import java.awt.event.*;

//JFrame���Զ���SwingӦ�ó�����̳е�ֱ�Ӹ���
public class ApplicationGUI extends JFrame {
	//����һ������
	Container c;
	//����������������ʱҲ�ڴ�����
	JLabel label;
	
	//ͨ���ڹ��췽�����������ĳ�ʼ��
	public ApplicationGUI() {
		//ʵ��Ϊ���ڸ�����
		super("Application GUI");

		//�õ���ǰʵ����������壬Ϊ����ʹ�ã�ͨ������һ������������
		c = getContentPane();
		
		//��ʼ��һ����ͼ���Swing��ǩ
		Icon icon = new ImageIcon("swing.gif");
		label = new JLabel("Swing��ǩ", icon, SwingConstants.CENTER);
		
		//���Ѹñ�ǩ��ӵ�������������λ��
		c.add(label, BorderLayout.CENTER);
		
		//����������������ʵ�����ظ�������С�����...
	}
	
	//����
	public static void main(String[] args) {
		//����ʵ��
		ApplicationGUI f = new ApplicationGUI();
		
		//���ô��ڴ�С��pack���������ʺϵĳߴ���ʾ
		f.pack();
		//���ô��ڿɼ�
		f.setVisible(true);
		//���ô����������
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}