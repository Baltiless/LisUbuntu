//: EvaluationOrder.java

//package g3ds.joop.ch3;

public class EvaluationOrder{
	public static void main(String[] args){
		int a=20;

		/* "5+++a"���ڵ�һ���������ź����ո� �ָ������ȿ��ǣ���
		   ������ݲ������ȸ�ֵ�Լ������ҵ����ԭ�򣬻�ѡ�++��������ֵ5
		   �����Ǳ������޷��������������������£�
			unexcepted type
			required:variable
			found:value
			1 error
		*/
		System.out.println("a=" + a);
		System.out.println("(5+ ++a)="+(5+ ++a));
		System.out.println("���a=" + a);

		/*
		   ����5+--a�����Բ��ӿո���Ϊ�����ڡ�+-��������������ţ���ˡ�+--�����Ϊ
		   �������ұ߲������Լ���ֵ�����Ƚ���һԪ���㡰--�����ٽ��ж�Ԫ���㡰+����
		   ������++a+++a�����������������Ͳ������ĺ��壺�Ͼ�ʱ�����������������ԭ��
		   ����������+++���������Ϊ���������߲����������������㣬�ڽ��м�����֮ǰ����
		   �Բ�������ֵ����߱��ʽ��ֵʱ��ͼ��ͬһ������ִ�ж����������㣬����a++�õ���
		   ����ֵ����ִ���������㽫��������ʱ����
		*/
		System.out.println("(5+--a)="+(5+--a));
		System.out.println("���a=" + a);
		System.out.println("(++a+ ++a)="+(++a+ ++a));
		System.out.println("���a=" + a);

		// ����ѱ��ʽ��Ϊa+++5����a+++a���ǺϷ��ģ�ͬ���ĵ���
		// ���ݴ����ҵ����ԭ�򣬽���++����ϵ���ߵı���a��
		System.out.println("(a+++5)="+(a+++5));
		System.out.println("���a=" + a);
		System.out.println("(a+++a)="+(a+++a));
		System.out.println("���a=" + a);

		// ��߲������ȸ�ֵ�����ı��˱���a��ֵ����Ӱ�쵽�ұߵĲ�����
		System.out.println("((a=20)+a)="+((a=20)+a)); 
		System.out.println("���a=" + a);
		// ���ұ߲�������ֵ�ı��˱���a��ֵ��������Ӱ����ߵĲ�����
		System.out.println("(a+ (a=15))="+(a+ (a=15))); 
		System.out.println("���a=" + a + '\n');
		
		// �����Ϊ��������ֵ�Ĺ����з����쳣����ǰλ���ұߵĸ�ֵ�����ж�
		int b=1;
		try{
			int i=forgetIt()/(b=2);
		}catch(Exception e){
			System.err.println(e);
			System.out.println("�ұ߸�ֵ�����жϣ�b="+ b);
		}
		
		// Java������ѭ�ȸ�ֵ������ԭ��
		try{
			int i=a/(b=0)*forgetIt();
		}catch(Exception e){
			System.out.println("\n��ֵ�Ժ���������Ƿ�Ϸ������Ϸ�ʱ�����쳣��");
			System.err.println(e);
		}
		
		// �����ֵ���̷����쳣��������Ҳ���ж�
		try{
			int i=a/((b=0)*forgetIt());
		}catch(Exception e){
			System.out.println("\n��ֵ���������쳣������һ�����������Ƿ�Ϸ���");
			System.err.println(e);
		}
		
		// ������������ȼ���˳���ԣ�������ѧ�����ϵĺ��ʽ�������������ͬ
		double d=8e+307;
		System.out.println("\n(4.0*d*0.5)=" + (4.0*d*0.5));
		System.out.println("(2.0*d)=" + (2.0*d));
		
		// ��Ϊ�����Ĵ��ݲ�������ֵ����ͬ����ѭ������ԭ��
		String str="left";
		System.out.println("\n��ʵ��ʱͬ����ѭ������ԭ��");
		passArgument(str, str="right");
	}
	
	// ��������쳣�ķ���
	static int forgetIt() throws Exception{
		throw new Exception("��ֵ���������쳣��");
	}
	
	// ��ƴ������ķ���
	static void passArgument(String str1, String str2){
		System.out.println(str1+"  "+str2);
	}
}
