//: UsingMyException.java

//package g3ds.joop.ch5;

public class UsingMyException{
	//���巽��ʱ������throws�����Ը��쳣������
	public void f()  throws MyException{
		//�ڴ˴�����һ���쳣
		throw new MyException("Throwing MyException from f()");
	}
	
	//�����׳��쳣�ķ�����������봦��ͬ��Ҫ��throws����
	public void g() throws MyException {
		//�����쳣�ķ���
		f();
	}
	
	public static void main(String[] args){
		//�����׳��쳣�ķ�������������
		try {
			new UsingMyException().g();
		} 
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println("�������Ĳ���...");
	} 
}

//�����Լ����쳣��
class MyException extends Exception {
	public MyException() {}
	
	public MyException(String msg) {
		//���ø��๹�췽��������msg��
		//�Ա���Throwable.getMessage()������ʾ
		super(msg);
	}
}