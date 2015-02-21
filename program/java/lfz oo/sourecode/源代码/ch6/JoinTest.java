//: JoinTest.java

//package g3ds.joop.ch6;

public class JoinTest{
	public static void main(String[] args){
		//�����ⲿ��ʵ��
		JoinTest obj=new JoinTest();
		
		//�����ڲ����߳�ʵ��������֮
		MyThread p1 = obj.new MyThread("����");
		MyThread p2 = obj.new MyThread("����");
		MyThread p3 = obj.new MyThread("������");
		
		//���̵߳ȴ����߳�ִ����Ϸ��غ�������Ĳ���
		try{
			p1.join();
			p2.join();
			p3.join();
		}catch(InterruptedException e){}
		
		System.out.println("���̵߳����ִ����ϣ�");
	}
	
	//���һ����չThread���ڲ���
	private class MyThread extends Thread{
		//��ƴ���ʵ�����Ĺ��췽��
		MyThread(String name){
			super(name);
			
			//�������߳�
			start();
		}
		
		//���Ǹ����run����
		public void run(){
			try{
				Thread.sleep(100);
				
				System.out.println(this.toString() + "ִ����ϣ�");
			}
			catch(InterruptedException e){}
		}
	}
}