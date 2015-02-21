//: ArrayManipulation.java

//package g3ds.joop.ch4;

//�������Arrays��İ�
import java.util.*;

public class ArrayManipulation{
	public static void main(String[] args){
		int count=10;
		//����һ������
		int[] array=new int[count];
		for(int i=0; i<array.length; i++)
			array[i]=(int)(Math.random()*100);
		
		//����arraycopy����������������
		int[] arrayCopy=new int[count];
		System.arraycopy(array, 0, arrayCopy, 0, array.length);
		
		//���õײ���Ƶ����򷨶�����Ԫ�ؽ�������
		System.out.println("�ӵͲ��д���򷨣�");
		bubbleSort(array);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+"  ");
		
		//ֱ�ӵ���Arrays���sort����
		System.out.println("\nֱ�ӵ���Arrays���sort������");	
		Arrays.sort(arrayCopy);
		for(int i=0; i<arrayCopy.length; i++)
			System.out.print(arrayCopy[i]+"  ");
		System.out.println();
	}
	
	//�ӵͲ��д����Ԫ�����򷽷�
	static void bubbleSort(int[] array){
		int n=array.length-1;
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i; j++){
				if(array[j]>array[j+1]){
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
}