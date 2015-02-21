//: TestLSP.java

//package g3ds.joop.ch5;

public class TestLSP{
	//���һ������������������Ƶ����Ƿ�����LSP����
	//���������ݵĲ�����Rectangle��
	static void testLSP(Rectangle r){
		//����ʱ�������������ֵͬ�������������������е�
		//Ҳ����˵������ֻ��֪����������ͣ�����֪����������
		//��Υ����LSP����
		r.setWidth(4.0)	;
		r.setHeight(5.0);
		
		System.out.print("���γ� "+ r.getWidth());
		System.out.print("�����ο� "+ r.getHeight());
		System.out.println("����� "+r.area());
	}
	
	public static void main(String[] args){
		//��ʵ������ΪRectangleʱ�����Ϊ20
		testLSP(new Rectangle(1.0, 1.0));
		
		//��ʵ������ΪSquareʱ�����Ϊ25
		testLSP(new Square(1.0));
	}
}