//: MemberInit.java
//: ����ԭ��������Bruce Eckel֮"Thinking in Java"

// package g3ds.joop.ch4;

public class MemberInit{
	//main�������౻�����Ժ���ò�ִ��֮
	public static void main(String[] args) {
		System.out.println("��main�����д���Cupboard���� ");
		new Cupboard();
		
		System.out.println("��main�������ٴ���Cupboard����");
		new Cupboard();
		
		t2.f2(1);
		t3.f3(1);
	}
	
	//���徲̬�������ڼ�����ʱ��ʼ��
	static Table t2 = new Table();
	static Cupboard t3 = new Cupboard();
} 

class Bowl {
	//���췽��
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}
	
	//ʵ������
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Table {
	//���徲̬�������ڼ�����ʱ��ʼ��
	static Bowl b1 = new Bowl(1);
	
	//���췽��
	Table() {
		System.out.println("Table()");
		
		//����Bowl��ʵ������
		b2.f(1);
	}
	
	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}
	
	//���徲̬�������ڼ�����ʱ��ʼ��
	static Bowl b2 = new Bowl(2);
}

class Cupboard {
	//����ʵ��������ֻ�д���ʵ��ʱ�Ž��г�ʼ��
	Bowl b3 = new Bowl(3);
	
	//���徲̬�������ڼ�����ʱ��ʼ��
	static Bowl b4 = new Bowl(4);
	
	Cupboard() {
		System.out.println("Cupboard()");
		
		//����Bowl��ʵ������
		b4.f(2);
	}
	
	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}
	
	//���徲̬�������ڼ�����ʱ��ʼ��
	static Bowl b5 = new Bowl(5);
}