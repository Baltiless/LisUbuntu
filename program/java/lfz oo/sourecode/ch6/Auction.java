//�� Auction.java

//package g3ds.joop.ch6;

public class Auction{
	public static void main(String[] args){
		//����������ͬ������BidThread��ֱ�Ӵ���2���̵߳�����
		BidThread p1=new BidThread(10, 1000);
		BidThread p2=new BidThread(10, 1000);
		
		//�趨�߳����ƣ����ڹ۲죺��˭�ܵÿ죡
		p1.setName("�Ա�");
		p2.setName("����");

		//����BidRun���2��ʵ��������������ͬ
		BidRun r1=new BidRun(10, 1000);
		BidRun r2=new BidRun(10, 1000);
		BidRun r3=new BidRun(10, 1000);
		BidRun r4=new BidRun(10, 1000);
		
		//�趨��ʵ�������ƣ����ڹ۲죺��˭�ܵÿ죡
		r3.setName("����");
		r4.setName("ʨ��");
		
		//�������ϵ�BidRun���2��ʵ�������Ӵ����̵߳�����
		Thread p3=new Thread(r3);
		Thread p4=new Thread(r4);
		
		//�����߳�
		p1.start();
		p2.start();
		p3.start();
		p4.start();	
		
		//��һ�λ�ʹ���߳�һֱ�ȴ����߳̽�����ż�����������
		try{
			p1.join();
			p2.join();
			p3.join();
			p4.join();
		}
		catch(InterruptedException e){}
		
		//���̲߳�����Ҫ�ȴ��������е����߳�ִ����ϲż����������䣬
		//��Ҳ��֤���̲߳����Եĸ��
		System.out.println("�߳̾����������̵߳����ִ����ϣ�");
	}
}