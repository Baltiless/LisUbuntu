//: AppletGUI.java

//package g3ds.joop.ch9;

/*���Swing GUI������3����ͨ������Ҫ����*/
//����Swing���ʱ
import javax.swing.*;
//����AWTһЩ�ײ����ʱ����Container
import java.awt.*;
//����AWT�¼�ʱ����������û���¼�����
import java.awt.event.*;

//JApplet���Զ���SwingС������̳е�ֱ�Ӹ���
public class AppletGUI extends JApplet {
	//����һ������
	Container c;
	//����������������ʱҲ�ڴ�����
	JLabel label;
	
	//ͨ����д��init�����������������ĳ�ʼ��
	public void init() {
		//�õ���ǰʵ����������壬Ϊ����ʹ�ã�ͨ������һ������������
		c = getContentPane();
		
		//��ʼ��һ����ͼ���Swing��ǩ
		Icon icon = new ImageIcon("swing.gif");
		label = new JLabel("Swing��ǩ", icon, SwingConstants.CENTER);
		
		//���Ѹñ�ǩ��ӵ�������������λ��
		c.add(label, BorderLayout.CENTER);
		
		//����������������ʵ�����ظ�������С�����...
	}
}