//:ProcessOrNot.java

//package g3ds.joop.ch5;

public class ProcessOrNot{
	public static void main(String[] args){
		int result=0;
		
		//���쳣������
		result=5/0;

		/*
		//���쳣���д���
		try {
			result=5/0;
		} catch(ArithmeticException e) {
			e.printStackTrace(System.err);
		}
		*/

		//�������֮��Ĳ���
		System.out.println("result="+ result);
	}
}