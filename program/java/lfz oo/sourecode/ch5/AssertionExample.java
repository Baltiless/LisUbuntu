//: AssertionExample.java

//package g3ds.joop.ch5;

public class AssertionExample{
	public static void main(String[] args){
		int age=Integer.parseInt(args[0]);
		System.out.println("����������֣�"+age);
		
		//���������
		assert age>0: "�����������󣨷�������";
		
		//������ͨ�������������³����
		System.out.println("����ʵ�������ǣ�"+age+"�ꡪ��ף���������٣�");
	}
}