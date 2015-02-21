
/*
public class NewInteger{
	//��������
  	int value;
	
	public static void main(String[] args){
		NewInteger obj1 = new NewInteger();
		obj1.value = 100;
		
		NewInteger obj2 = new NewInteger();
		obj2.value = 60;
		
		System.out.println(obj1.value == obj2.value);
	}
}


final public class NewInteger{
	//��������Ϊ˽��
  	private int value;
	
	//���ù��췽�������Ա�����ֵ
	public NewInteger(int value){
		this.value=value;
	}
	
	//����intValue��ȡֵ
	public int intValue(){
		return value;
	}

	//ֱ�ӷ���JDK��Integer���equals�������
	public boolean equals(Object obj){
		if  (obj instanceof NewInteger){
			return value==((NewInteger)obj).intValue();
		}
		return false;
	}
	
	//�������ԣ�����ʱȥ��
	public static void main(String[] args){
		NewInteger obj1 = new NewInteger(100);
		NewInteger obj2 = new NewInteger(60);
		
		System.out.println(obj1.equals(obj2));
	}
}
*/
//*
final public class NewInteger{
	//��������Ϊ˽��
  	private int value;
	
	//���ù��췽�������Ա�����ֵ
	public NewInteger(int value){
		this.value=value;
	}
	
	//����intValue��ȡֵ
	public int intValue(){
		return value;
	}
	
	//�ʺ���ͬ���ͣ���Ҫת�ͣ��ȽϺͲ�ͬ���ͱȽϣ�
	public boolean equals(Object obj){	
		try{
			//ֱ����ת����ͬ���ͱȽ�
			return value==((NewInteger)obj).intValue();
		}catch(ClassCastException e){
			//����catch�Ӿ�����Ͳ���������д���
			return false;
		}
	}
		
	//�������equals�������ڴ���������Ϊͬ���ͣ�����Ҫת�ͣ��Ƚϣ����Ӵ˷����Լ��ٿ���
	public boolean equals(NewInteger obj){
		return value==obj.intValue();
	}
	
	//�������ԣ�����ʱȥ��
	public static void main(String[] args){
		NewInteger obj1 = new NewInteger(100);
		NewInteger obj2 = new NewInteger(60);
		
		System.out.println(obj1.equals(obj2));
	}
}

//*/