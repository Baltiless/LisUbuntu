//: YieldTest.java

//package g3ds.joop.ch6;

public class YieldTest{
	public static void main(String[] args){
		//�����ⲿ��ʵ��
		YieldTest obj=new YieldTest();
		
		//�����ڲ����߳�ʵ��������֮
		MyThread p1 = obj.new MyThread("����");
		MyThread p2 = obj.new MyThread("����");
		MyThread p3 = obj.new MyThread("������");
	}
	
	//���һ����չThread���ڲ���
	private class MyThread extends Thread{
		//��ƴ���ʵ�����Ĺ��췽��
		MyThread(String name){
			super(name);
			
			// �������߳�
			start();
		}
		
		//���Ǹ����run����
		public void run(){
			for(int i=0; i<5; i++){
				System.out.println(toString() + ": " + i);
				
				//�����ѵ�ǰ�̵߳�Ȩ���ó�����Ƚ����벻���������Ĳ��
				Thread.yield();
			}
		}
	}
}