//: PropertyDemo.java

//package g3ds.joop.ch5;

public class PropertyDemo{
	public static void main(String[] Args){
		System.out.println("����ϵͳ��"+System.getProperty("os.name"));
		System.out.println("�û�����"+System.getProperty("user.name"));
		System.out.print("Java�����: "+System.getProperty("java.vm.name"));
		System.out.println(" "+System.getProperty("java.vm.version"));
		System.out.println("Java�ṩ�̣�"+System.getProperty("java.vendor"));
	}
}