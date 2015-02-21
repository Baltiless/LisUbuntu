//: Kid.java

//package g3ds.joop.ch6;

public class Kid{
	//��Ƶõ����Ե���ķ���
	public void eat(Cake cake){
		//��ͼ�õ�һƬ����
		Cake piece = cake.getPiece();
		
		if(piece != null){		
			//����ֵ�һ�ݵ��⣬�Ϳ��Գ���...
			piece.start();
		}
	}
	
	//������ص�����ͬ�����߳�
	public static void main(String[] args){
		//�趨�����͵���Ƭ����Ҳ����Ƴ�ͨ���������ݽ���
		int number = 5;
		
		Kid[] kids = new Kid[number];
		
		//�龰���
		System.out.println("��һ������ " + kids.length + " λС���ѡ�");
		
		//���˵���
		Cake chocolate = new Cake("�ɿ���", number);
		
		//���Ե���û�й������޷����Ե����
		chocolate.start();
		
		try{
			//�����ϵ��߳̽����������������
			chocolate.join();
		}catch(InterruptedException e){}
		
		System.out.println();
		for(int i=0; i<kids.length; i++){
			kids[i] = new Kid();
			
			//�ֵ��ⲢƷ��֮
			kids[i].eat(chocolate);
		}
		
		//����˯��ʱ�䣬�Ա������߳���ʱ����������join��������
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		
		//���Լƻ�֮�������˵���Ӧ
		System.out.println();
		System.out.println("��ʱ������һλС����...");
		Kid unluckyKid = new Kid();
		unluckyKid.eat(chocolate);
	}
}


//����߳���
class Cake extends Thread{
	private int count;
	private boolean isBelonged;
	private Cake[] pieces;
	
	//�ṩ���ⲿʹ�õĹ��췽�����൱��ÿ����Ķ��Ǵ󵰸�
	Cake(String kind, int number){
		System.out.println("���충����" + kind + "���⣬�óԼ�����");
		
		pieces = new Cake[number];
		
		for(int i=0; i<pieces.length; i++){
			//�ѵ�����Ƭ
			pieces[i] = new Cake();
		}
		
		System.out.println("���ɷָ� " + number + " λС���ѡ�");
		
		//������¼�����Ƿ����
		count = number;
	}
	
	//ר���������ɵ���Ƭ����Ȼ���ǵ��⣬ֻ����СЩ���ѣ�
	private Cake(){}
	
	//��д��run����
	public void run(){
		try{
			//��û�˳Ե�״��
			if(!isBelonged){
				System.out.println("�˻�û��������ô��ѽ��");
				
				//��ʾ��ֱ�ӷ���
				return;
			}
			
			//�����Ѿ��ֵ�С�������к�ɽ��е�״����ʵ�����̵߳���Ҫ����	
			System.out.println(this.getName() + "����Ʒ��...");
			
			Thread.sleep(500);		
		}catch(InterruptedException e){}
	}
	
	//��������ֵ���ķ���
	public Cake getPiece(){
		//��������״��
		if(count<=0){
			System.out.println("�Բ����������ˣ������Ѿ����꣡");
			
			return null;
		}
		
		//���е����״��
		int i = count-1;	
		
		pieces[i].isBelonged = true;
		pieces[i].setName("��" + count + "Ƭ����");
		
		count--;
		
		return pieces[i];
	}
}