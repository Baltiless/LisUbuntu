//: PuzzledString.java

//package g3ds.joop.ch4;

public class PuzzledString{
	public static void main(String agrs[]){
		//��������������ͬ��String�ͱ������ÿ��ٳ�ʼ��������������
		String a1="test";
		String b1="test";
		
		//�б������������Ƿ�����ͬһ������
		if(a1==b1)
			System.out.println("I think so.");
		else
			System.out.println("So Surprising!");
		
		//��������������ͬ��String�ͱ�������new������������
		String a=new String("test");
		String b=new String("test");

		//�б������������Ƿ�����ͬһ������
		if(a==b)
			System.out.println("I think so.");
		else
			System.out.println("So Surprising!");
	}
}