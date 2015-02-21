//: DaemonTest.java

//package g3ds.joop.ch6;

public class DaemonTest{
	public static void main(String[] args){
		//����һ���ػ��߳�
		Thread d = new DaemonThread();
		
		//����ͨ��������������ı��ػ��߳�Ϊ�û��߳�
		if(args.length>0){
			//ע�⣡��һ���������߳�����ǰִ�У���������ʱ����
			//�쳣��java.lang.IllegalThreadStateException
			d.setDaemon(false);
		}
		
		//�����߳�	
		d.start();
		
		//��⵱ǰʵ���Ƿ�Ϊ�ػ��߳� 
		System.out.println("d.isDaemon() = " + d.isDaemon());
	}
}

class DaemonThread extends Thread {
	//�趨���߳���Ŀ
	private static final int SIZE = 10;
	private Thread[] t = new Thread[SIZE];
	
	public DaemonThread() { 
		//ȱʡ״̬����ʵ�������ػ��߳�
		setDaemon(true);
	}
	
	public void run() {	
		//�����ǰʵ�����ػ��̵߳ĸ����������	
		if(isDaemon())
			System.out.println("�ػ��߳��е����߳��Զ���Ϊ�ػ��̣߳�");	
		else
			System.out.println("�û��߳��е����߳����ʲ��䣺");	
			
		for(int i = 0; i < SIZE; i++){
			//������ǰʵ�������̣߳�ʹ��this�ؼ���
			t[i] = this.new DaemonSpawn(i);
		
			//��⵱ǰʵ�������߳��Ƿ�Ϊ�ػ��߳�	
			System.out.println("t[" + i +
				"].isDaemon() = " + t[i].isDaemon());
		}
		
		//ʹ��yield�����ó�CPU����Ȩ
		if(isDaemon()){
			//��Ϊ�ػ��̣߳��ں�̨��������״̬�����������ѭ��
			while(true) 
				yield();
		}
		else
			yield();
	}
	
	//��Ƶ�ǰ������߳��࣬��û��������Ϊ�ػ��߳�
	private class DaemonSpawn extends Thread {
		DaemonSpawn(int i) {
			System.out.println("DaemonSpawn " + i + " started");
			
			//�����߳�
			start();
		}
	
		public void run() {
			//ʹ��yield�����ó�CPU����Ȩ
			if(isDaemon()){
				//��Ϊ�ػ��̣߳��ں�̨��������״̬�����������ѭ��
				while(true) 
					yield();
			}
			else
				yield();
		}
	}
}