//: ObjectEqualUpdate.java

//package g3ds.joop.ch4;

public class ObjectEqualUpdate{
	public static void main(String[] args){
		Integer n1 = new Integer(100);
		Integer n2 = new Integer(100);
		MyIntUpdate m1 = new MyIntUpdate(100);
		MyIntUpdate m2 = new MyIntUpdate(100);
		
		System.out.println("ʹ�ù�ϵ������Ƚ϶���");
		System.out.println("n1 == n2 : " + ( n1 == n2 ));
		System.out.println("m1 == m2 : " + ( m1 == m2 ));
		
		System.out.println("ʹ��ʹ��equals()�����Ƚ϶�������");
		System.out.println("n1.equals(n2) : " + n1.equals(n2));
		System.out.println("m1.equals(m2) : " + m1.equals(m1));
	}
} 

// �Զ���һ����
class MyIntUpdate {
	//��������Ϊ˽��
  	private int value;
	
	//���ù��췽�������Ա�����ֵ
	MyIntUpdate(int value){
		this.value=value;
	}
	
	MyIntUpdate(){
		this(0);
	}
	
	//����setValue��ֵ
	public void setValue(int value){
		this.value=value;
	}
	
	//����getValue��ȡֵ
	public int getValue(){
		return value;
	}

	//ֱ�ӷ���Integer����equals���������
	public boolean equals(Object obj){
		if  (obj instanceof MyIntUpdate){
			return this.value==((MyIntUpdate)obj).value;
		}
		return false;
	}

	/*����equals��������һ����ư汾����
	//���μ���е��ҵ�����磬Steven L. Halter�ȣ�Java�������裬
	//  ����ԭ�ģ�Enterprise Java Performance��
	//���Ϸ������ݲ���������ΪObject���������������ԣ�
	//������һ������µĶ���Ƚϣ����������쳣��������������ͬ�Ķ���Ƚϣ�
	//instanceof�����Ƕ���ģ����������㿪���������һ�������Ż��汾���£�
	public boolean equals(Object obj){
		//ֱ��������ת���������Ͳ�ƥ��ʱ������ת���쳣������instanceof��ת������ʹ��
		try{
			return this.value==((MyIntUpdate)obj).value;
		}
		catch(ClassCastException cce){
			//������Ͳ�ƥ���򷵻�false
			return false;
		}
	}
		
	//���ң��ڴ���������Ϊͬ���ͱȽϣ�����������·����Լ��ٿ���
	public boolean equals(MyIntUpdate obj){
		return this.value==obj.value;
	}
	*/
}