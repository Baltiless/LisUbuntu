//: FinalizeTest.java

//package g3ds.joop.ch4;

public class FinalizeTest {
	public static void main(String[] args)  {
		for(int i=0; i<10;i++){
			//����һϵ��Seed����,
			//��Ϊ��Щ���󲢲������ã�һ�������ͳ�Ϊ��ʵ�ϵ�"����"
			new Seed();	
		}
		//�����������������Ϣ
		System.out.println(Seed.gcount+" instances are created.");
		
		//��õ�ǰ��Runtime����
		Runtime rt=Runtime.getRuntime();
		
		//������������ǰ�����Ŀ����ڴ漰�ڴ��������
		System.out.println("Memory before Garbage Collection:"+
			rt.freeMemory()+"/"+rt.totalMemory());
		
		//������������
		rt.gc();
		//����
		//System.gc();//�൱��Runtime.getRuntime().gc();
		
		/***���������ռ�������һ�����ȼ���͵��̣߳�
			����ʱ����ȷ����������µ���������һ��һ��***/
		//������������ռ������Ժ�����Ķ�������
		System.out.println(Seed.fcount+" instances are killed.");
		//������������ռ������Ժ�ǰ�����Ŀ����ڴ漰�ڴ��������
		System.out.println("Memory after Garbage Collection:"+
			rt.freeMemory()+"/"+rt.totalMemory());
		
		System.exit(0);
	}
} 

class Seed{
	//gcount������¼������ʵ������
	static int gcount=0;
	//fcount������¼�ѱ������ʵ������
	static int fcount=0;
	
	public Seed(){
		//����ʵ��ʱgcount����1
		gcount++;
		
		//��ʾ������ʵ������Ϣ
		System.out.println("Instance:"+this.toString()+" instances are created.");
	}
	
	protected void finalize() throws Throwable{
		//���ø����finalize����
		super.finalize();
		
		//���ʵ��ʱfcount����1
		fcount++;
		
		//��ʾ�����ʵ������Ϣ
		System.out.println("Instance:"+this.toString()+"  instances are killed.");
	}
}