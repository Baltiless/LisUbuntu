//: Hobby.java

//package g3ds.joop.ch5;

public class Hobby {
	//���ڼ�¼һ��õ�����
	private String name;

	//���ڼ�¼ӵ�е�ǰ���������
	private Person person;

	public Person getPerson() { 
		return person; 
	}
	
	public Hobby(String name, Person person) {
		this.name = name; 
		this.person = person;
	}

	public String getName() { 
		return name; 
	}

}