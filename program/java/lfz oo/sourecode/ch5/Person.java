//: Person.java

//package g3ds.joop.ch5;

import java.util.Vector;

public class Person {
	// �趨������Ϣ
	private String name;
	private int age;

	//�������ڼ�¼һ���˰��õļ���
	private Vector hobbies = new Vector();

	//ȡ��һ���˵İ��ü���
	public Hobby[] getHobbies() { 
		//�Ѽ����е�Ԫ��ת����Hobby���Ͳ�������ķ�ʽ����
		return (Hobby[]) hobbies.toArray(new Hobby[0]);
	}
	
	//����һ���
	public void addHobby(String hobbyName) {
		hobbies.add(new Hobby(hobbyName, this));
	}
	
	
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
}