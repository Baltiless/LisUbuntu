//: Employee.java

//package g3ds.joop.ch4;

// ���Employee��
public class Employee{
	//Ϊ�˸��õط�װ�࣬�����±���������Ϊ˽�е�
	//���һ������������¼��Ա�������Թ�˾��ÿ��Ա������Ӧ����һ�µģ��������Ϊ�����
	private static int count; 

	//��¼��Ա�ĸ�����Ϣ��Ӧ��ÿ����Ա����ӵ�У��������Ϊʵ������
	private String firstName;
	private String lastName;

	//��ƹ��췽���Ĳ������ֲ������������������¹�Ա�ĸ�����Ϣ
	public Employee( String firstName, String lastName ){
		//����Ƹһ����Աʱ����¼�������Ϣ
		//�ֲ����������Ժ�ʵ����������ͬ��ʹ��ʱ����this�ؼ���ָ��ʵ������
		this.firstName = firstName;
		this.lastName = lastName;

		//���ѹ�˾��Ա�����Զ���1
		++count; 
	}

	//��дObject���е�finalize()�������ڶ������ʱ�Զ����ã�
	protected void finalize(){
		//ʹ���й�Ա��ְʱ����˾��Ա�����Զ���1
		--count; 
	}

	//ͨ��������ƣ��ѹ�Ա������Ϣ��Ϊ��ֻ����
	public String getFirstName(){ 
		return firstName; 
	}

   	public String getLastName(){ 
		return lastName; 
	}

	// �ѹ�˾��Ա������Ϣ��Ϊ��ֻ��������ΪcountΪ�������
	// ���Ҳ�ѱ�������Ϊ�෽�����Ա��ڶԵȷ���
	public static int getCount(){ 
		return count; 
	} 
}