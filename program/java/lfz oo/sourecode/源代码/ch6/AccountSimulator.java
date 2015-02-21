//: AccountSimulator.java

//package g3ds.joop.ch6;

public class AccountSimulator{
	//����2���ʻ�
	protected CustomerAccount savings;
	protected CustomerAccount checking;
	
	public static void main(String[] args){
		//Ԥ�ȷֱ����1000Ԫ������ͨ����������
		int transfers= 1000;
		try{
			transfers=Integer.parseInt(args[0]);
		}catch(Exception e){}
		
		//��ʼģ��
		AccountSimulator am=new AccountSimulator(transfers);
	}
	
	//ģ�����Ĺ��췽��
	public AccountSimulator(int transfers){
		//����2���ʻ�
		savings=new CustomerAccount(transfers);
		checking=new CustomerAccount(transfers);
		
		
		/*����ģ����������ͬʱ��2���ʻ���ת��*/
		TransferManager tm1=new TransferManager(checking, savings);
		TransferManager tm2=new TransferManager(savings, checking);
		
		Thread t1=new Thread(tm1);
		Thread t2=new Thread(tm2);
		
		t1.start();
		t2.start();
		
		//ֱ��2���߳�ִ����ϼ����Ժ����
		try{
			t1.join();
			t2.join();
		}catch(Exception e){}
		
		//���Ǯ�ĸ�ʽ����ʾ
		java.text.NumberFormat formatter=
			java.text.NumberFormat.getCurrencyInstance(
			java.util.Locale.CHINA);
		
		System.out.println("ת��֮ǰ���ʻ��������: "+
			formatter.format(transfers*2));

		System.out.println("ת��֮�����ʻ��������: "+
			formatter.format(savings.getBalance()+
			checking.getBalance()));
	}
}


//ģ��ת�ʵĹ���
class TransferManager implements Runnable{
	//����2���ʻ�
	protected CustomerAccount fromAccount;
	protected CustomerAccount toAccount;
	
	//ת�ʼ���
	protected volatile int transferCount;
	
	//����һ����̬����䵱����������ͬ�����ʱʹ��
	private static Object obj=new Object();	
		
	public TransferManager(CustomerAccount from, CustomerAccount to){
		this.fromAccount=from;
		this.toAccount=to;
	}
	
	//ʵ��run����	
	public void run(){
		//���������ֲ�����
		double balance;//���
		double transferAmount;//ת�ʴ���
		
		while( transferCount<8){
			/*���ͬ���Ķ����������౾���̬����*/
			//ע����������Ķ��巽ʽ��
			//synchronized(TransferManager.class){
			//����
			synchronized(obj){
			
			/*���˴�ʹ��ʵ����������Ч����Ϊ����ʵ����Runnable�ӿڣ�
			  �̷ֱ߳��Ӧ��ͬ�Ķ���*/
			//synchronized(this){
				
				//��һ���ʻ���������Ϣ
				balance=fromAccount.getBalance();
							
				//ȷ��ת�ʶ�ȣ����Ϊ����һ�룬ʹ���ʻ��в���Ϊ��
				transferAmount=(int)(balance*Math.random()/2);
			
				//������µ������
				balance -= transferAmount;
											
				/*�ڴ�����һ��ͣ�٣����������������������׼���
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){}
				//*/
			
				//д���ʻ�
				fromAccount.setBalance(balance);
				
			
				//����һ���ʻ��л�������Ϣ		
				balance=toAccount.getBalance();
				
				//�Ѵ�ǰһ���ʻ�������Ŀ���ӵ���ǰ�ʻ������
				balance += transferAmount;
			
				//*�ڴ�����һ��ͣ�٣������ڿ�������������������
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){}
				//*/
			
				//��д���ʻ�
				toAccount.setBalance(balance);
				
			//��synchronized��Ӧ�Ļ�����
			}		
				
				//������ѭ������������
				transferCount++;
		}
	}
}


//��ƹ�����Դ���˴�Ϊ�����ʻ�
class CustomerAccount{
	//���
	protected double balance;
		
	public CustomerAccount(double initialBalance){
		balance=initialBalance;	
	}
	
	//��ȡ�����	
	public double getBalance(){
		return balance;
	}
	
	//������ȡ������룩����������
	public void setBalance(double newBalance){
		balance=newBalance;
	}
}