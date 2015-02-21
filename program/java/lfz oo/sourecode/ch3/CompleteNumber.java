//: CompleteNumber.java
/*
  Ҫ�ж�һ����Ȼ���Ƿ�Ϊ���������ȱ����ҵ�������������
  ��һ���������������������ü�����ٶȿ���ص㣬��2��ʼ����������������
  Ϊֹ��ż����������ֵ�Ķ���֮һ��������������ֵ������֮һ��������ȡģ�жϣ�
  ���ǿ��Ա�����������Ϊ������������
*/

//package g3ds.joop.ch3;

public class CompleteNumber{
	public static void main(String[] args){
		int i;
		try{
			i=Integer.parseInt(args[0]);
		}catch(Exception e){
			i=10000;
		}
		
		seekNumber(i);
	}
	
	public static void seekNumber(int i){
		int number=2;
		int factor=1;
		String str="1";
		int maxDivisor, divisor;
		
		do{
			if(number%2==0)
				maxDivisor=number/2;
			else
				maxDivisor=number/3;
			
			divisor=2;
			while(divisor<=maxDivisor){
				if(number%divisor==0){
					factor +=divisor;
					str +=(" + "+ divisor);
				}
				
				divisor++;
			}
			
			if(factor==number)
				System.out.println(number + "=" + str);
				
			number++;
			
			factor=1;
			str="1";			
		}while(number<=i);
	}
}