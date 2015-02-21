//: ThreadSharedData.java

//package g3ds.joop.ch6;

public class ThreadSharedData implements Runnable{
	//ʵ������֮���߳��ǹ����
	int sharedValue=100;
	
	public void run(){
		//�ֲ�����֮���߳����Ƕ�����
		int nonSharedValue=0;
		
		//�ı����ֵ
		sharedValue +=100;
		nonSharedValue +=100;
		
		//����ʾ		
		System.out.println("SharedValue= " + sharedValue);
		System.out.println("NonSharedValue= " + nonSharedValue);
		
		//������������
		doSomething();
	}
	
	public void doSomething(){
		//�ֲ�����֮���߳����Ƕ�����
		int nonSharedValue=0;
		
		//�ı����ֵ
		nonSharedValue +=100;
		sharedValue +=100;
		
		//����ʾ 	
		System.out.println("SharedValue(inMethod)= " + sharedValue);
		System.out.println("NonSharedValue(inMethod)= " + nonSharedValue);	
	}
	
	//����
	public static void main(String[] args){
		ThreadSharedData t=new ThreadSharedData();
		
		for(int i=0; i<2; i++){
			new Thread(t).start();
		}
	}
}