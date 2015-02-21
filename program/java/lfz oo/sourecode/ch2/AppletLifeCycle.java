//: AppletLifeCycle.java

//package g3ds.joop.ch2;

import javax.swing.JApplet;
import java.awt.Graphics;

public class AppletLifeCycle extends JApplet{
	//��¼�ַ����ı���
	StringBuffer buffer;
	
	public void init(){
		//����ʱ������Ӧ�Ķ���
		buffer = new StringBuffer();
		
		addItem("����... ");
	}
	
	public void start(){
		addItem("����... ");
	}
	
	public void stop(){
		addItem("ֹͣ... ");
	}
	
	public void destroy(){
		addItem("����ɾ��...");
	}
	
	//addItem�������ڸ�����ʾ
	void addItem(String newWord){
		//�ڱ�׼����ն���ʾ��ִ�з����е��ַ���
		System.out.println(newWord);
		
		//���ַ�������StringBuffer������
		buffer.append(newWord);
		
		//ˢ��
		repaint();
	}
	
	public void paint(Graphics g){
		//�趨��ʾ�����С
		g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);
		
		//��StringBuffer�����е����ݻ��Ƴ���
		g.drawString(buffer.toString(), 5, 15);
	}
}