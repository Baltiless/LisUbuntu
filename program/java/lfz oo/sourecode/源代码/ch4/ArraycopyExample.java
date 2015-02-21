//: ArraycopyExample.java

//package g3ds.joop.ch4;

public class ArraycopyExample{
	public static void main(String[] args){
		//����һ��int������
		int[] i1={1, 2, 3};
		
		//��int����ֵ��i1���Ƶ�i2�Ĳ���Ԫ���У�i1[0]->i2[1]
		int[] i2=new int[3];
		System.arraycopy(i1, 0, i2, 1, 2);
				
		//���ڻ������͵�ֵ���ܹ���������i1��i2��Ԫ�ؽ�����Ӱ��
		i1[0]=2;
		System.out.println("���ڻ������ͣ��ı临��Դ�����Ԫ�ز���Ӱ��Ŀ������Ԫ��\n"+
				"Դ������Ŀ���������: "+ (i1[0]==i2[1]));
		
		//����һ����������
		StringBuffer[] str1=new StringBuffer[3];
		str1[0]=new StringBuffer("a");
		str1[1]=new StringBuffer("b");
		str1[2]=new StringBuffer("c");
		
		//���������͵�ֵ��str1���Ƶ�str2�Ĳ���Ԫ���У�str1[0]->str2[1]
		StringBuffer[] str2=new StringBuffer[3];
		System.arraycopy(str1, 0, str2, 1, 2);
		
		//����Ԫ���д洢��ֵ�Ƕ���ͬStringBuffer���������
		//���Դ�����Ŀ������Ԫ����Ȼ���
		str1[0]=str1[0].append("a");
		System.out.println("�����������ͣ�����Ԫ���д洢��ֵ����ͬһ�����������\n"+
				"Դ������Ŀ���������: "+ (str1[0]==str2[1]));
		
		//������ά����
		int[][] array=new int[3][];
		array[0]=new int[]{5, 6};
		array[1]=new int[]{2, 3};
		array[2]=new int[]{7, 8};
		
		//��ά����ִ��arraycopy�����������
		int[][] arrayCopy=new int[3][2];
		System.arraycopy(array, 0, arrayCopy, 0, 1);
		array[0][0]=0;
		System.out.println("���ڶ�ά���飬Դ������Ŀ���������: "+ (array[0]==arrayCopy[0]));
		
		//clone����ֻ��ʵ�ֵ��㸴��
		int[][] arrayClone=(int[][])array.clone();		
		System.out.println("clone����ֻ��ʵ�ֵ��㸴��\n"+
				"array==arrayClone: "+	(array==arrayClone));
		System.out.println("array[0]==arrayClone[0]: "+
				(array[0]==arrayClone[0]));
		
		//Ҫ�Լ�ʵ����㸴��
		for(int i=0; i<array.length; i++){
			arrayClone[i]=(int[])array[i].clone();
		}
		System.out.println("�Լ�ʵ����㸴��\n"+
				"array==arrayClone: "+(array==arrayClone));
		System.out.println("array[0]==arrayClone[0]: "+
				(array[0]==arrayClone[0]));	
	}
}