//: WhoIsUse.java

//package g3ds.joop.ch4;

public class WhoIsUse{
	public static void main(String[] agrs){
		//����һ��ֵΪ5��Integerʵ������Ϊû�м�ʱ�����������
		//ʵ�����������һ�����������޷��ٱ�ʹ�ã���ʱ�п��ܱ������
		new Integer(5);
		
		//����һ��ֵΪ5��Integerʵ������Ȼû�ж����������
		//���ڸ�����п��Ե��øö���ķ��������ԣ��Ժ�Ҳ�޷��ٱ�ʹ��
		int i=new Integer(5).intValue();
		System.out.println(i);
		
		//����һ��ֵΪ10��Integerʵ��������ʱ�����������
		//�˺�������ô��������ͱ���myInt��ʹ�øö���
		Integer myInt=new Integer(10);
		
		i=myInt.intValue();
		System.out.println(i);
		
		//����һ��ֵΪ100��Integerʵ��������ʱ�����������
		Integer anotherInt=new Integer(100);
		System.out.println(anotherInt.intValue());
		
		//�������ͱ���myIntָ��ֵΪ100��Integerʵ������ʱ������anotherInt
		//����ͬһ�����󣬶�ԭ��myInt���õ�ֵΪ10�Ķ����Ѳ��ٱ�ʹ�ã����Ա����
		myInt=anotherInt;
		System.out.println(myInt.intValue());
		
		//������ǰ�myInt��anotherInt�����öϿ�����ֵΪ100�Ķ���Ҳ���Ա����
		myInt=null;
		anotherInt=null;
	}
}