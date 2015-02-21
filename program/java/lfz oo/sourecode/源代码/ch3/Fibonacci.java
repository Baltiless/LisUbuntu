//: Fibonacci.java

//package g3ds.joop.ch3;

public class Fibonacci{
	public static void main(String[] args){
		int number;
		long startTime, endTime;
		
		try{
			number=Integer.parseInt(args[0]);
		}catch(Exception e){
			number=32;
		}
		
		System.out.println("����������Fibonacci("+ number + ")���У�");
		//��¼�������㿪ʼ��ʱ��
		startTime=System.currentTimeMillis();
		for(int i=0; i<=number; i++){
			System.out.print(FibonacciByIteration(i)+"  ");
		}
		//��¼�������������ʱ��
		endTime=System.currentTimeMillis();
		System.out.println("\n���������ѵ�ʱ�䣨���룩��"+(endTime-startTime)+'\n');
		
		System.out.println("�ݹ鷨����Fibonacci("+ number + ")���У�");
		//��¼�ݹ���㿪ʼ��ʱ��
		startTime=System.currentTimeMillis();
		for(int i=0; i<=number; i++){
			System.out.print(FibonacciByRecursion(i)+"  ");
		}
		//��¼�ݹ���������ʱ��
		endTime=System.currentTimeMillis();
		System.out.println("\n�ݹ鷨���ѵ�ʱ�䣨���룩��"+(endTime-startTime));
	}
	
	//���õ���������Fibonacci����
	public static long FibonacciByIteration(long n){
		if(n==0L || n==1L) return n;
		else{
			//ѭ���ĳ�ʼ����
			long n1=0L;
			long n2=1L;
			
			long result=0L;
			//��������
			for(long times=2L; times<=n; times++){
				result=n1+n2;
				n1=n2;
				n2=result;		
			}
			return result;
		}
	}
	
	//���õݹ鷨����Fibonacci����
	public static long FibonacciByRecursion(long n){
		//�ݹ���õ���������ʵ��
		if(n==0L || n==1L) return n;
		//�ݹ����
		else return (FibonacciByRecursion(n-2)+FibonacciByRecursion(n-1));
	}
	
	
}