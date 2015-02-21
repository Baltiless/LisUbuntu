//: Drinker.java

//package g3ds.joop.ch6;

public class Drinker{
	private String name;
	
	//����������
	public Drinker(String name){
		this.name = name;
	}
	
	//ѡ����Ʒ
	public void drink(Beverage beverage){
		System.out.println(name + "�Լ����������ǣ�" + beverage.getName());
		
		//��ʼ��֮
		beverage.start();
	}
	
	//���Բ�����߳�
	public static void main(String[] args){
		new Drinker("�Ʋ���").drink(new Beverage("����"));
		
		new Drinker("������").drink(new Beverage("ơ��"));
	}
}


class Beverage extends Thread{
	private String name;
	
	//��Ʒ������
	Beverage(String name){
		super(name);
		
		this.name=name;	
	}
	
	//��дThread���run����
	public void run(){
		while(true){
			//����
			drink();
		
			//����ţ��״�������ó�CPU����Ȩ		
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){}
			
			Thread.yield();
		}
	}
	
	//������Ʒ�����������б�Ҫ����չ�า��֮
	void drink(){
		System.out.println("��ϲ����" + name + "...");
	}
}