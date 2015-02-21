//: ReferenceConversion

//package g3ds.joop.ch3;

public class ReferenceConversion{
	public static void main(String[] args){
		ReferenceChild child=new ReferenceChild();
		//����Ϊ�����������ʵ�֣������Զ�ת��
		ReferenceParent parent=child;
		//��ʱ���ø������е�ͬ���������̬�Զ��������෽��
		parent.show();
		//���Ƕ���ͬ�����������ǵ��ø�������ԣ��������������Ҫ��
		System.out.println(parent.str);	
		//��Ҫ���������ͬ��������Ҫ��ǿ������ת�������Ѹ������ת��Ϊ����
		System.out.println(((ReferenceChild)parent).str);
	}	
}

class ReferenceParent{
	String str="ReferenceParent's Attribute";
	protected void show(){
		System.out.println("ReferenceParent's Method");
	}
}

class ReferenceChild extends ReferenceParent{
	String str="ReferenceChild's Attribute";
	protected void show(){
		System.out.println("ReferenceChild's Method");
	}
}