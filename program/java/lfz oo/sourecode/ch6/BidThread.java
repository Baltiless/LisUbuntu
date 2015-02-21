//: BidThread.java

//package g3ds.joop.ch6;

public class BidThread extends Thread {
	//��¼ÿ�εľ���
	int finalBid;
	
	//���۵�����ֵ
	int increment;
	
	//ÿ�ξ��۵���ʱ�����룩
	int delayTime;
	
	BidThread(int increment, int delayTime) {
		this.increment = increment;
		this.delayTime = increment;
	}
	
	//���Ǹ����run����
	public void run() {
		try{
			for(int i=0; i<100; i++){
				finalBid += increment;
				System.out.println(toString() + " BID: " + finalBid);
				Thread.sleep(delayTime);
			}
		}
		catch(InterruptedException e){
			return;
		}
	}
	
	//������Thread����չ���߳�����
	public static void main(String[] args){
		//�����̣߳�����������ͬ
		BidThread p1=new BidThread(10, 1000);
		BidThread p2=new BidThread(10, 1000);
		BidThread p3=new BidThread(10, 1000);
		BidThread p4=new BidThread(10, 1000);
		
		//�趨�߳����ƣ����ڹ۲죺��˭�ܵÿ죡
		p1.setName("�Ա�");
		p2.setName("����");
		p3.setName("����");
		p4.setName("ʨ��");
		
		//�����߳�
		p1.start();
		p2.start();
		p3.start();
		p4.start();	
	}
}