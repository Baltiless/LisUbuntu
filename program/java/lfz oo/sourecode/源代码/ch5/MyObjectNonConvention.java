//: MyObjectNonConvention.java.java

//package g3ds.joop.ch5;

public class MyObjectNonConvention{
	public static void main(String[] args){
		MyModifiedObject m1 = new MyModifiedObject(new StringBuffer("Ten"),10);
		MyModifiedObject m2 = new MyModifiedObject(new StringBuffer("Ten"),10);
		
		System.out.println("ʹ�ù�ϵ������Ƚ϶���");
		System.out.println("m1 == m2 : " + ( m1 == m2 ));
		
		System.out.println("ʹ��ʹ��equals()�����Ƚ϶�������");
		System.out.println("m1.equals(m2) : " + m1.equals(m1));
		
		System.out.println("���ϸ���Զ�����ɢ���룺");
		System.out.println("m1.hashCode()="+m1.hashCode());
		System.out.println("m2.hashCode()="+m2.hashCode());
	}
} 

// �Զ���һ����
class MyModifiedObject {
	//��������Ϊ˽��
  	private int value;
  	private StringBuffer name;
	
	//���ù��췽�������Ա�����ֵ
	MyModifiedObject(StringBuffer name, int value){
		this.name=name;
		this.value=value;
	}
	
	MyModifiedObject(){
		this(new StringBuffer("Zero"),0);
	}
	
	//���setValue��getValue
	public void setValue(int value){
		this.value=value;
	}
	
	public int getValue(){
		return value;
	}
	
	//���setName��getName
	public void setName(StringBuffer name){
		this.name=name;
	}
	
	public StringBuffer getName(){
		return name;
	}

	//���equals����
	public boolean equals(Object obj){
		if  (obj instanceof MyModifiedObject){
			return this.value==((MyModifiedObject)obj).value &&
				   this.name==((MyModifiedObject)obj).name;
		}
		return false;
	}

	//ͬ�����hashCode�������������㷨�����ʣ�
	public int hashCode(){
		int hashCode=(new Integer(value).hashCode())^name.hashCode();
		return hashCode;
	}
}