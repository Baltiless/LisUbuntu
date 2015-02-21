//: Customer.java

//package g3ds.joop.ch6;

import java.util.*;

//����һ��������Դ��
public class Customer{
	//�Թ˿ͱ��
	private int number;
	
	public Customer(int number){
		this.number=number;
	}
	
	//ģ��ĳλ�˿���Ҫ����
	public void call(){
		System.out.println(getNumber() + " �ſ��ˣ�����������");
		
		//���λ�˿ͽ���������嵥
		Waiter.list(this);	
	}
	
	//��ù˿ͱ����Ϣ
	public int getNumber(){
		return number;
	}
	
	//���Ի����߳�
	public static void main(String[] args){
		//��������˿ͣ����Ҳ����������̣߳�ʹ֮����һ����
		Customer c1=new Customer(1);
		Customer c2=new Customer(2);	
		Customer c3=new Customer(3);
		
		c1.call();
			
		//����ֻ��2��������
		Waiter w1=new Waiter("��������->");
		Waiter w2=new Waiter("��������");
		
		w1.start();
			
		c2.call();
		c3.call();
		
		new Customer(4).call();
		
		c2.call();
		w2.start();
	}
}


//��Ʒ�����Ϊ�߳���
class Waiter extends Thread{
	//�ṩ�嵥�д�����˿͵�������
	private volatile static int index;
	//��¼��Ҫ����˿�����
	private static int total;
	//����һ��ArrayList���ϣ�������java.util����
	private static List customers=new ArrayList();
	
	//����Ϊ�������ṩһ���������ı���
	private static Object obj=new Object();
	
	Waiter(String name){
		//�����ƴ����߳�
		super(name);
	}
	
	//��дrun����
	public void run(){
		//��ʼ�ϰ��ṩ����
		serve();
	}
	
	//��ƾ���ķ������
	void serve(){
		Customer c=null;
		
		//�ϰ�ʱ������п�����Ҫ���񣬷������������ţ�
		while(true){
			/*ͬ������飬����Ϊ���еķ��������Ⱦ���ķ������*/
			synchronized(obj){
				//���û�������Ъ�Ű�
				if(index>=total) break;
						
				//����Ͱ�˳��Ϊ�˿ͷ���
				c=(Customer)(customers.get(index));
				
				try{
					Thread.sleep(1000);	
				}catch(InterruptedException e){}
				
				index++;
			}
			
			/*����Ϊ�龰���*/
								
			String str ="����Ϊ " + c.getNumber() + " �ſ���";
			String waiter = getName();
			
			System.out.println(waiter + str + "����");
			
			//�����ó�CPU
			Thread.yield();
			
			System.out.println(waiter + str + "�ϲ�...");
				
			System.out.println(waiter + str + "���...");
			
			//�����ó�CPU	
			Thread.yield();
		}
	}
	
	//��ƵǼ���Ҫ����Ĺ˿�
	static void list(Customer customer){
		System.out.println("�������Ͼ�������");
		
		customers.add(customer);
			
		total++;
	}
}