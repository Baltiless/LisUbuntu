//: ArrayExample.java

//package g3ds.joop.ch3;

public class ArrayExample{
	public static void main(String[] args){
		//����һ����ά���飬��ֱ�ӽ��г�ʼ��
		int[][] m1={{0, 1, 2},{3, 4},{5, 6, 7, 8, 9}};
		System.out.println("�������ĳ��ࣺ"+m1.getClass().getSuperclass());
		System.out.println("��ά����m1��Ԫ�ظ�����"+m1.length);
		System.out.println("��ά����m1��Ԫ�أ�һά���飩m1[2]��Ԫ�ظ�����"+m1[2].length);
		
		//���ƶ�ά����
		int[][] m2=(int[][])m1.clone();
		System.out.println("��ά����m2��m1���и��ƣ�ֻ��ʵ�ֵ��㸴��");
		System.out.println("\t���ж������Ժ�m1��m2�Ƿ�Ϊͬһ���� "+ (m1==m2));
		System.out.println("\t���ж������Ժ�m1[0]��m2[0]�Ƿ�Ϊͬһ���� "+ (m1[0]==m2[0]));
	}
}