//: StringExample.java

//package g3ds.joop.ch3;

public class StringExample{
	public static void main(String[] args) {
		//�ַ������ٴ�����ʽ��ֱ�ӷ����ַ���������
		String hello = "Hello", lo = "lo";
		
		System.out.println("ʹ���ַ����������ж���������");
		//ͬһ�����п��ٴ������ַ������ó���ͬһ����
		System.out.print((hello == "Hello") + " ");
		//ͬһ�����п��ٴ������ַ������ó���ͬһ����
		System.out.print((Other.hello == hello) + " ");
		//��ͬ���п��ٴ������ַ������ó���ͬһ����
		System.out.print((g3ds.joop.ch3.otherPackage.StringCase.hello == hello) + " ");
		//���ٴ������ַ��������ڱ���ʱ������Ϊһ���ַ�����Ҳ���ó���ͬһ����
		System.out.print((hello == ("Hel"+"lo")) + " ");
		//String.intern()�����������ó����뵱ǰ�ַ���������ͬ��String����
		System.out.println(hello == ("Hel"+lo).intern());
		
		System.out.println("����ʹ���ַ����������ж���������");		
		//�ó���new�����ַ������󣬲����ó�����Ӧ�Ķ���
		String helloNew=new String("hello");
		System.out.print((hello == helloNew) + " ");
		//���ٴ������ַ������ַ����������ӣ�����������ʱ���㣬��ͬ����new����
		System.out.println((hello == ("Hel"+lo)) + " ");
		
		System.out.println("�ַ������ݲ��ɱ��ı�����ӣ�");
		//����helloCopy���ó����ַ���"hello"����
		String helloCopy = hello;
		System.out.println("�ı�hello����֮ǰhelloCopy�����ݣ�"+helloCopy);
		//�ı�hello������
		hello="Hello World";
		//����ǳ����ַ�����������ݱ��ı䣬��helloCopy������ҲӦ���Ÿı䣬ʵ�ʲ������
		System.out.println("�ı�hello����֮��helloCopy�����ݣ�"+helloCopy);
		//����������һ������helloWorld���ó����ַ���"Hello World"������������hello��ͬ
		String helloWorld="Hello World";
		System.out.println("�ڳ��д���һ���µĶ���"+(hello==helloWorld));
		//һ�ָ������String�������ݵ�д�����£�ʵ����Ҳ�Ǵ���һ���µĶ���
		helloCopy+=" World";
		System.out.println("����ʱ���㴴��һ���µĶ��󣬲��ӳ������ã�"+(helloCopy!=helloWorld));
	}
}

class Other { 
	//�����ͬһ��JVM�е��ÿ��ٴ�����String���󣬶���һ����������
	static String hello = "Hello"; 
}