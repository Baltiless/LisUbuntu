//: Company.java

//package g3ds.joop.ch4;

public class Company{
	//����Ϊfinal�ĳ�Ա������ʽ��ʼ�������򱨴�
	//  variable COMPANY_NAME might not have been initialized
	private static final String COMPANY_NAME="���⸮";
	
	public static void main(String[] args){
		/*
		  �����ֲ�����
		  ע�⣡�ֲ�����������ӷ���Ȩ�����η������򱨴�
		      illegal start of expression
		*/
		String output = "��Ƹ��λ��" + getCompanyName() + 
			"\n��Ƹǰ��˾��Ա����: " +Employee.getCount();

		// ��Ƹ�¹�Ա
		Employee e = new Employee( "��", "��" );//e��һ���������ñ���
		output += "\n�½���Ա: " + e.getLastName() + " " +
			 e.getFirstName() + "; ��˵���Ĺ�˾��Ա���� = " + 
			 e.getCount() ;//ͨ����Ա�˽⵽��˾��Ϣ
		Employee e1 = new Employee( "��", "��" );//e1��һ���������ñ���
		output += "\n�½���Ա: " + e1.getLastName() + " " +
			 e1.getFirstName() + "; ��˵���Ĺ�˾��Ա���� = " + 
			 e1.getCount() ;//ͨ����Ա�˽⵽��˾��Ϣ
		Employee e2 = new Employee( "��", "��" );//e2��һ���������ñ���
		output += "\n�½���Ա: " + e2.getLastName() + " " +
			 e2.getFirstName() + "; ��˵���Ĺ�˾��Ա���� = " + 
			 e2.getCount() ;//ͨ����Ա�˽⵽��˾��Ϣ
   
		// ͨ�����������˽⹫˾��Ϣ������������෽����
		output += "\n�ӹ�˾��ҳ���ʵ���˾��Ա����: " + Employee.getCount();
   
		// ��һ����Ա��ְ����λ�ճ�
		e1 = null;  
		output += "\n\n��˾������ְ������ ";
		
		// �ڱ����У�����������������Ѳ��ٱ����ã����Ա����
		// System.gc()�����������������ٱ����õĶ��󣬵��������ȼ��ϵͣ�
		// һ�������������ö��󣬵����Ǿ��Եģ����4.4"�������"
		System.gc(); 
		
		output += "\n��˾��ҳ���º�Ĺ�Ա����: " + Employee.getCount();

		System.out.println(output);
	}
	
	//�˷�������Ϊfinal,�����ٱ���д
	public static final String getCompanyName(){
		return COMPANY_NAME;
	}
}