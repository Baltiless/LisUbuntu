//: PuzzledConstructor.java

//package g3ds.joop.ch4;

public class PuzzledConstructor{
	public static void main(String[] args){
		//����һ�¿���
		new PuzzledConstructor();
	}
	
	/*
	  ����һ��α���췽����ʵ������һ���빹�췽��ͬ����ʵ������
	  ����ʧ�����������ڸպð������ĳɺ�ԭ����ĳ��������һ����
	  ����û���޸���Ӧ��һЩ����
	  ��ȻҲ�ͱ���������淶�йأ�������ѭ��������Сд��ĸ��ʼ�ȵȡ���
	  ����ʱ��������ǡ��û�н��ϣ��ǾͿ��ۣ���
	*/
	void PuzzledConstructor(){
		System.out.println("α���췽����");
	}
	
	//�������Ĺ��췽��
	PuzzledConstructor(){
		System.out.println("�湹�췽����");
	}
}