//: VariableInit.java

//package g3ds.joop.ch4;

public class VariableInit{
	//���������
	static int classVariable;
	//����ʵ������
	int instanceVariable;
	String str;
	
	public static void main(String[] args){
		for(int i=0; i<3; i++){
			new VariableInit().showValue(i);	
		}
	}
	
	void showValue(int argument){
		//�����ֲ���������������ʽ��ֵ�󷽿ɱ�����
		int localVariable=0;
		int showVariable;
		
		//��Ϊ�������ݵ���ʽ���������ڷ�������ֱ�ӵ���
		switch(argument){
			case 0: 
				//classVariable��ȱʡ��ֵ������ֱ�ӵ���
				showVariable=classVariable;
				str="showVariable=classVariable="+showVariable;
				break;
			
			case 1: 
				//instanceVariable��ȱʡ��ֵ������ֱ�ӵ���
				showVariable=instanceVariable;
				str="showVariable=instanceVariable="+showVariable;
				break;
				
			case 2: 
				// ���localVariableû�и�ֵ��������
				//    variable localVariable might not have been initialized
				showVariable=localVariable;
				str="showVariable=localVariable="+showVariable;
				break;
		}
		
		System.out.println(str);
	}
}