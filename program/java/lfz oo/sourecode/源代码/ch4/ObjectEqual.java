//: ObjectEqual.java

//package g3ds.joop.ch4;

public class ObjectEqual{
	public static void main(String[] args) {
		Integer n1 = new Integer(100);
		Integer n2 = new Integer(100);
		MyInt m1 = new MyInt();
		MyInt m2 = new MyInt();
		m1.value = 100;
		m2.value = 100;

		// ʹ��==���ж���ıȽϣ���Ȼ���߶�Ϊfalse
		System.out.println("ʹ�ù�ϵ������Ƚ϶���");
		System.out.println("n1 == n2 : " + ( n1 == n2 ));
		System.out.println("m1 == m2 : " + ( m1 == m2 ));
		
		// ʹ��equals()�������бȽϣ�����Integer���д�ķ���
		System.out.println("����equals()����ʱ");
		System.out.println("Integer�ࡪn1.equals(n2) : " + n1.equals(n2));
		
		// ʹ��equals()�������Զ������Ľ��бȽϣ�ʵ�����ǵ���Object��ķ���
		System.out.println("MyInt�ࡪm1.equals(m2) : " + m1.equals(m2));
	}
} 

class MyInt {
  int value;
}

