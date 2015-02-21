//: MyObjectConvention.java

//package g3ds.joop.ch5;

public class MyObjectConvention{
	public static void main(String[] args){
		MyObject m1 = new MyObject("Ten",10);
		MyObject m2 = new MyObject("Ten",10);
		
		System.out.println("ʹ�ù�ϵ������Ƚ϶���");
		System.out.println("m1 == m2 : " + ( m1 == m2 ));
		
		System.out.println("ʹ��ʹ��equals()�����Ƚ϶�������");
		System.out.println("m1.equals(m2) : " + m1.equals(m1));
		
		System.out.println("����Զ������ɢ���룺");
		System.out.println("m1.hashCode()="+m1.hashCode());
		System.out.println("m2.hashCode()="+m2.hashCode());
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}
} 

// �Զ���һ����
class MyObject {
	//��������Ϊ˽��
  	private int value;
  	private String name;
	
	//���ù��췽�������Ա�����ֵ
	MyObject(String name, int value){
		this.name=name;
		this.value=value;
	}
	
	MyObject(){
		this("Zero",0);
	}
	
	//���setValue��getValue
	public void setValue(int value){
		this.value=value;
	}
	
	public int getValue(){
		return value;
	}
	
	//���setName��getName
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}

	//���equals����
	public boolean equals(Object obj){
		if  (obj instanceof MyObject){
			return this.value==((MyObject)obj).value &&
				   this.name==((MyObject)obj).name;
		}
		return false;
	}

	//ͬ�����hashCode����
	public int hashCode(){
		int hashCode=(new Integer(value).hashCode())^name.hashCode();
		return hashCode;
	}
	
	//����toString����
	public String toString(){
		String info="MyObject: ";
		info += name + " means the number ";
		info += value;
		
		return info;
	}
}