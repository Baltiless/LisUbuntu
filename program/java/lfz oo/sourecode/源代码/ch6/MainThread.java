//: MainThread.java 

//package g3ds.joop.ch6;

public class MainThread { 
	public static void main(String[] args) { 
		//����һ���߳����ͱ������õ�ǰ�Ļ�̶߳���
		Thread t=Thread.currentThread(); 
		
		//�ѵ�ǰ�߳�����Ϊ�����̡߳�����Ϊ���ǲ�û����ʽ�������߳�
		t.setName("���߳�");
		
		//�����ǰ�߳���Ϣ
		System.out.println("�������е��̣߳�" + t); 
	} 
}