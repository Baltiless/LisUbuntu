//: AStatic.java

//package g3ds.joop.ch4;

public class AStatic { 
	//���������
	static String a = "aaa";
	static String b = new B().sayHi_B();
	
	//���徲̬����� 
	static { 
		System.out.println("AStatic.static: AStatic's vars are: {" + AStatic.a + ',' + AStatic.b + '}' );
   	} 
   	
   	//����ʵ������
	void sayHi_AStatic() {
		System.out.println("AStatic.sayHi(): AStatic's vars are: {" + AStatic.a + ',' + AStatic.b + '}'); 
	}
	
	public static void main(String[] args) {
		//main�����е�����ڳ�ʼ����ִ��
		System.out.println("Then execute the clause in AStatic's main method.");
	} 
} 

class B{
	//���徲̬�����
	static{ 
		System.out.println("B.static #1: AStatic's vars are: {" + AStatic.a + ',' + AStatic.b + '}'); 
		new AStatic().sayHi_AStatic();
		System.out.println("B.static #2: AStatic's vars are: {" + AStatic.a + ',' + AStatic.b + '}');
	} 
	
	//����ʵ������
	String sayHi_B() {
		return "Hi";
	} 
	
    public static void main(String[] agrs) { }
}

/*	ִ��java AStatic ��java Bʱ��ʼ�����̵���ȷ�𰸷ֱ���
1. 	B.static #1: AStatic's vars are: {aaa,null}
 	AStatic.sayHi(): AStatic's vars are: {aaa,null}
	B.static #2: AStatic's vars are: {aaa,null} 
	AStatic.static: AStatic's vars are: {aaa,Hi}
2. 	AStatic.static: AStatic's vars are: {aaa,Hi}
	B.static #1: AStatic's vars are: {aaa,Hi}
	AStatic.sayHi(): AStatic's vars are: {aaa,Hi}
	B.static #2: AStatic's vars are: {aaa,Hi} 
3. 	AStatic.static: AStatic's vars are: {aaa,null}
	B.static #1: AStatic's vars are: {aaa,null}
	AStatic.sayHi(): AStatic's vars are: {aaa,null}
	B.static #2: AStatic's vars are: {aaa,null}
4. 	B.static #1: AStatic's vars are: {aaa,null} 
	AStatic.sayHi(): AStatic's vars are: {aaa,Hi}
	B.static #2: AStatic's vars are: {aaa,Hi}
	AStatic.static: AStatic's vars are: {aaa,Hi} 
*/