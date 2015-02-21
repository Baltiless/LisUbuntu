//: AnAGUI.java

//package g3ds.joop.ch9;

/*���Swing GUI������3����ͨ������Ҫ����*/
//����Swing���ʱ
import javax.swing.*;
//����AWTһЩ�ײ����ʱ����Container
import java.awt.*;
//����AWT�¼�ʱ����������û���¼�����
import java.awt.event.*;

/* ���SwingС�����Ӧ�ó����ܵ��Զ�������Ȼѡ��
   JApplet��Ϊֱ�Ӹ��࣬�Ա�������ļ���*/
public class AnAGUI extends JApplet {
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
	
	//�ڴ����main�������Ա������javaִ��
	public static void main(String[] args) {
		//����һ���Զ������ʵ��
		JApplet applet = new AnAGUI();
		
		//��������init������ע�ⲻ����������У�init���������Զ�����
		applet.init();
		
		//����һ�����ڣ���������ʾ��
		final JFrame f = new JFrame();
		
		//����һ��������䣺
		//��JAppletʵ�������������ݾ���JFrameʵ���������չʾ����
		f.setContentPane(applet.getContentPane());
		
		//���ô��ڱ���
		f.setTitle("AnA GUI");
		//���ô��ڴ�С��λ��
		f.setBounds(100,100,300,200);
		//���ô��ڿɼ�
		f.setVisible(true);
		//���ô����������
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
