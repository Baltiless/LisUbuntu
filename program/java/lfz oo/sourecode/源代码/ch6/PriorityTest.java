//: PriorityTest.java

//package g3ds.joop.ch6;

public class PriorityTest{
	public static void main(String[] args){
		//�����̵߳����ȼ���Ϊ���
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		//����2�����ȼ���һ�����߳�
		Counter hi = new Counter(Thread.NORM_PRIORITY + 2);
		Counter lo = new Counter(Thread.NORM_PRIORITY - 2);
		
		//�����߳�
		lo.start();
		hi.start();
		
		//���߳���ͣ��ʹ�����߳���ʱ��ִ��
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}

		//�ı�ѭ��������ʹ�����߳̽���
		lo.stop();
		hi.stop();

		//�ȴ����߳̽���
		try {
			hi.t.join();
			lo.t.join();
		} catch (InterruptedException e) {}

		//�ֱ�������ȼ���ͬ�����̼߳���ֵ
		System.out.println("Low-priority thread: " + lo.count); 
		System.out.println("High-priority thread: " + hi.count);
	}
}

class Counter implements Runnable {
	int count = 0;
	Thread t;
	
	//���ü���ѭ������������volatile�ؼ���ʹ��ÿ��ѭ����Ҫ���¶�����ֵ
	private volatile boolean running = true;

	public Counter(int p) {
		//��Ӵ����߳�
		t = new Thread(this);
		
		//�����߳����ȼ�
		t.setPriority(p);
	}

	public void run() {
		//һֱ�ۼӼ�����ֱ�������ı�
		while (running) {
			count++;
		}
	}

	//�ṩ�ı�ѭ�������ķ���
	public void stop() {
		running = false;
	}
	
	//�����̵߳ķ���
	public void start() {
		t.start();
	}
}