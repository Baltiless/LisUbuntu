//: ThreadList.java

//package g3ds.joop.ch6;

public class ThreadList{
	public static void main(String[] args) {
		//�����ⲿ��ʵ��
		ThreadList obj=new ThreadList();
		
		//�����ڲ����߳�ʵ��������֮
		obj.new MyThread("����").start();
		obj.new MyThread("����").start();
		obj.new MyThread("������").start();

		/*
		//��������������飬�������߳̿��ܶ�ִ���겢�����
		try{
			Thread.sleep(200);
			System.gc();
		}catch(InterruptedException e){}
		*/
		
		//�г���������δ��������߳���
		showThreads();
	}
	
	//���һ����չThread���ڲ���
	private class MyThread extends Thread{
		//��ƴ���ʵ�����Ĺ��췽��
		MyThread(String name){
			super(name);
		}
		
		//���Ǹ����run����
		public void run(){
			try{
				//System.out.println(toString()+": "+getThreadGroup().getName());
				
				Thread.sleep(100);
			}
			catch(InterruptedException e){}
		}
	}
	
	//��ȡ�����������߳��б�ķ���
	public static void showThreads(){
		Thread[] t=new Thread[Thread.activeCount()];
		
		int count=Thread.enumerate(t);
		
		System.out.println("���������̣߳�");
		for(int i=0; i<count; i++)
			System.out.print(t[i].getName()+ "\t");
		System.out.println();
	}
}