// DeadLock.java

//package g3ds.joop.ch6;


public class DeadLock implements Runnable{
	AssociatedClassA a = new AssociatedClassA();
	AssociatedClassB b = new AssociatedClassB();

	DeadLock() {
		Thread.currentThread().setName("Thread1");
		Thread t = new Thread(this, "Thread2");
		t.start();

		//�ɵ�ǰ�̻߳��a������
		a.foo(b);
		System.out.println("Back in main thread");
	}

	public void run() {
		//�������̻߳��b������
		b.bar(a); 
		System.out.println("Back in other thread");
	}

	public static void main(String args[]) {
		new DeadLock();
	}
}


//������������
class AssociatedClassA{
	//����������ͬ������
	synchronized void foo(AssociatedClassB b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + "::ִ��AssociatedClassA���foo����");

		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}

		System.out.println(name + "::��ͼִ��AssociatedClassB���last����");
		
		//���ù������ͬ������
		b.last();
	}
	
	//�ڹ������б����õ�ͬ��������ʵ���Ϸ�������
	synchronized void last() {
		System.out.println("Inside AssociatedClassA.last");
	}
}


//������������
class AssociatedClassB{
	//����������ͬ������
	synchronized void bar(AssociatedClassA a) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + "::ִ��AssociatedClassB���bar����");

		try {
			Thread.sleep(1000);
    	} catch(InterruptedException e) {}

		System.out.println(name + "::��ͼִ��AssociatedClassA���last����");
		
		//���ù������ͬ������
		a.last();
	}
	
	//�ڹ������б����õ�ͬ��������ʵ���Ϸ�������
	synchronized void last() {
		System.out.println("Inside AssociatedClassA.last");
	}
}