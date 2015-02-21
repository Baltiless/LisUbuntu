//: FinalVariable.java

//package g3ds.joop.ch4;

public class FinalVariable{
	public static void main(String[] args){
		//���ڻ�������
		final double PI=3.1415926;
		/*
		  �����ٸı�final�ͱ���PI��ֵ�����򱨴�
		      cannot assign a value to final variable PI
		*/
		//PI=3.14;
		
		//������������
		final int[] intArray=new int[5];
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();
		
		/*
		  �����ٸı�final�ͱ���intArray�����ã����򱨴�
		      cannot assign a value to final variable intArray
		*/
		//intArray=null;
		
		//�����Ըı�����Ԫ�ص�ֵ
		for(int i=0; i<intArray.length; i++){
			intArray[i]=i;
			System.out.print(intArray[i] + " ");
		}
		
		//����������
		final StringBuffer str=new StringBuffer("Hello ");
		
		/*
		  �����ٸı�final�ͱ���str�����ã����򱨴�
		      cannot assign a value to final variable str
		*/
		//str=new StringBuffer("Hello ");
		
		//�����Ըı����ö��������
		str.append("world.");
		System.out.println("\n" + str);
		
	}
}