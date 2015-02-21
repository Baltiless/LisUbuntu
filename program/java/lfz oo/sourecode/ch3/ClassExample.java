//: ClassExample.java

//package g3ds.joop.ch3;

public class ClassExample{
	// ������Ա���ԣ������Ǿ�̬�Ļ�Ǿ�̬��
	int i;
	static int j;
	
	// ��̬��ʼ������
	static{
		j=10;
		System.out.println("In static initializer.");
	}
	
	// ʵ����ʼ������
	{
		i=10;
		System.out.println("In instance initializer.");
	}
	
	// ���췽��
	public ClassExample(){
		System.out.println("In constructor.");
	}
	
	// ��Ƕ�࣬�����Ǿ�̬�Ļ�Ǿ�̬��
	static class NestedClass implements InnerInterface{
		public void f(){}
	}
	
	// ��Ƕ�ӿڣ�������ʽ����ʽ�������Ǿ�̬��
	interface InnerInterface{void f();}

	// �����Ա�����������Ǿ�̬�Ļ�Ǿ�̬��
	public static void main(String[] args){
		new ClassExample();
	}
}
