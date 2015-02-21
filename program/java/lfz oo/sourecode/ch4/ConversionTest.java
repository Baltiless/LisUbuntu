//: ConversionTest.java

//package g3ds.joop.ch4;

class Super{
	static String str1="����ľ�̬����";
	String str2="�����ʵ������";
	
	static void showStatic(){
		System.out.println("����ľ�̬����");
	}
	
	void showNonStatic(){
		System.out.println("�����ʵ������");
	}
}

class This extends Super{
	//�����볬�������ľ�̬����
	static String str1="����ľ�̬����";
	
	//�����볬��������ʵ������
	String str2="�����ʵ������";
	
	//����д����ľ�̬����ʱ���ڵ�ǰ����Ҳ�������Ϊ��̬�ģ����򱨴�
	static void showStatic(){
		System.out.println("����ľ�̬����");
	}
	
	//��д�����ʵ������
	void showNonStatic(){
		System.out.println("�����ʵ������");
	}
	
	//����������еĳ�Ա�����������Ǿ�̬�Ļ��߷Ǿ�̬��
	static String str3="�������г�Ա����";
	
	//����������еĳ�Ա�����������Ǿ�̬�Ļ��߷Ǿ�̬��
	void showDetail(){
		System.out.println("�������еĳ�Ա����");
	}
}

public class ConversionTest{
	public static void main(String arg[]){
		//���ԣ��Գ�������������ʵ����������ת��
		Super obj=new This();
		
		//�Ծ�̬�ͷǾ�̬��Ա�Ķ�̬���Ʋ���
		System.out.println(obj.str1);
		System.out.println(obj.str2);
		obj.showStatic();
		obj.showNonStatic();
		
		//�����Ƕ��������г�Ա�Ĳ���
		
		//�������佫����cannot resolve symbol
		//System.out.println(obj.str3);
		//obj.showDetail();
		
		//������������խ��ת����������ִ��
		System.out.println(((This)obj).str3);
		((This)obj).showDetail();
	}
}