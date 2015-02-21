//: BidRun.java

//package g3ds.joop.ch6;

public class BidRun implements Runnable {
	//��¼ÿ�εľ���
	int finalBid;
	
	//���۵�����ֵ
	int increment;
	
	//ÿ�ξ��۵���ʱ�����룩
	int delayTime;
	
	//����ʵ������
	private String name;
	
	BidRun(int increment, int delayTime) {
		this.increment = increment;
		this.delayTime = increment;
		
		//���û��Ϊʵ��������toString������Ȼ����ɢ����
		this.name=Integer.toHexString(this.hashCode());
	}
	
	//ʵ�ֽӿ�Runnable��run����
	public void run() {
		try{
			for(int i=0; i<100; i++){
				finalBid += increment;
				System.out.println(toString() + " BID: " + finalBid);
				
				//Thread.currentThread()�������ص�ǰ���е��̣߳���������Ӧ����
				//��sleep����ֻ��Ϊ�˷��㣬ʵ���Ͼ�̬������ֱ�����������á�
				Thread t = Thread.currentThread();
				t.sleep(delayTime);
			}
		}
		catch(InterruptedException e){
			return;
		}
	}
	
	//�ṩΪʵ�������ķ���
	void setName(String name){
		this.name=name;
	}
	
	//����toString����
	public String toString(){
		return "Thread[" + name + ",      ]";
	}
	
	//����ʵ��Runnable�ӿڵ��ഴ���߳�
	public static void main(String[] args){
		//����ʵ��������������ͬ
		BidRun r1=new BidRun(10, 1000);
		BidRun r2=new BidRun(10, 1000);
		BidRun r3=new BidRun(10, 1000);
		BidRun r4=new BidRun(10, 1000);
		
		//�趨��ʵ�������ƣ����ڹ۲죺��˭�ܵÿ죡
		r1.setName("�Ա�");
		r2.setName("����");
		r3.setName("����");
		r4.setName("ʨ��");
		
		//�����ϵĶ��󴫵ݸ��߳�
		Thread p1=new Thread(r1);
		Thread p2=new Thread(r2);
		Thread p3=new Thread(r3);
		Thread p4=new Thread(r4);
		
		//�����߳�
		p1.start();
		p2.start();
		p3.start();
		p4.start();	
	}
}