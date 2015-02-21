//: ArrayEqual.java

//package g3ds.joop.ch4;

public class ArrayEqual{ 
	public static void main( String args[] ){ 
		//��������int���������
		int[] a=new int[5]; 
		int[] b=new int[5];
		int[] c=new int[5];;
		int i; 
		
		//Ϊa�����Ԫ�ظ�ֵ
		for( i=0; i<5; i++ ) 
			a[i]=i; 
		
		//���á�������a����b
		b=a;
		
		//����System������鸴�ư�a����c
		System.arraycopy(a,0,c,0,a.length);
		
		//�ֱ�Բ�ͬ�������е�Ԫ�ؽ��в���
		a[0]=4;
		b[4]=0;
		c[1]=11;
		
		//����֮һ���������a��b��c����֮��Ĺ�ϵ�ֱ���ʲô��
		System.out.println("b==a: "+ (b==a));
		System.out.println("c==a: "+ (c==a));
		
		//����֮��������a��b��c�и�Ԫ�ص�ֵ�ֱ���ʲô��
		System.out.println("a����Ԫ�ص�ֵ��");
		for( i=0; i<5; i++) {
			System.out.print("a["+i+"] = "+a[i]+"  "); 
		}
		
		System.out.println("\nb����Ԫ�ص�ֵ��");
		for( i=0; i<5; i++) {
						System.out.print("b["+i+"] = "+b[i]+"  "); 
		}
		
		System.out.println("\nc����Ԫ�ص�ֵ��");	
		for( i=0; i<5; i++) {
			System.out.print("c["+i+"] = "+c[i]+"  ");
		}
		System.out.println();
	}
} 