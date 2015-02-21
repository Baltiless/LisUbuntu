//: Consumer.java

//package g3ds.joop.ch6;

//�������߳�
public class Consumer extends Thread { 
	//���干����Դ
	private Soup soup;
	 
	public Consumer(int number) { 
		//...�����������һ��������˿��йص���Ϣ
	} 
	
	//���
	public void order(Soup soup){
		this.soup=soup;
		
		//�����������Ȼ�ص��ų���
		start();
	}
	
	public void run() { 
		for(;;){
			//�߳�
			soup.eat(); 
		
			//��̸...
			try { 
				Thread.sleep((int)(Math.random()*2000)); 
			}catch (InterruptedException e) {}  
		}
	}
	
	//���Խ���ʽ�����߳�
	public static void main(String args[]) { 
		//����������Դ
		Soup s = new Soup();
		
		//Ҳ���Բ��Դ��ڶ��������Դ���������
		//Soup s1 = new Soup();
		
		//Ϊ��ʹ���ֿ��ܶ���ʾ������������̹߳�����Դ
		Consumer c1 = new Consumer(5); 
		Consumer c2 = new Consumer(1); 
		Producer p1 = new Producer(1);
		Producer p2 = new Producer(2); 
		
		//�ֱ������߳�
		c1.order(s); 
		c2.order(s); 
		p1.cook(s); 
		p2.cook(s);
	}
}


//�������߳�
class Producer extends Thread { 
	//���干����Դ
	private	Soup soup; 

	public Producer(int number) { 
		//...�����������һ���������ʦ�йص���Ϣ
	} 
	
	//��ʼ���
	public void cook(Soup soup){
		//�ȵ�֪��ʲô
		this.soup=soup;
		
		//Ȼ��ʼ����
		start();
	}
	
	public void run() { 
		for(;;){
			//ץ����
			soup.cook();
			
			//Ȼ�󴭿���...
			try { 
				Thread.sleep((int)(Math.random() *1000)); 
			}catch (InterruptedException e) {}  
		}
	}
}


//���ǹ�����Դ
class Soup { 
	//����һ������ͬ����������������
	private boolean isReady = false; 
	
	//eatͬ������
	public synchronized void eat(){ 
		//�����û�����þ͵��Ű�
		while (!isReady){ 
			try { 
				System.out.println("���Ժ򣬲�����������");
				
				wait() ;
			}catch(InterruptedException e){} 			
		} 
		
		/*�������ϲ��Ժ���������*/
		
		System.out.println("�������������ã�");
		
		//������ʱ
		try {
			Thread.sleep((int)(Math.random() *2000));
		}catch(InterruptedException e){}
		
		System.out.println("Ʒ��֮��...");
		
		//��������Ϸ�������¿�ʼ
		System.out.println("���µ��...");
		isReady = false; 
		
		//֪ͨ�����߳�
		notifyAll(); 
	} 
	
	//cookͬ������
	public synchronized void cook() { 
		//����˶����þ�Ъ�Ű�
		while (isReady){
			try{ 
				System.out.println("�˶������á���");
				
				wait();
			}catch(InterruptedException e) {} 
		} 
		
		/*���������˵�����*/
		
		System.out.println("���֮��...");
		
		//������ʱ
		try{
			Thread.sleep((int)(Math.random() *2000));
		}catch(InterruptedException e){} 
		
		System.out.println("��������");

		//�ı�����ֵ
		isReady = true; 
		
		//֪ͨ�����߳�
		notifyAll(); 
	} 
}