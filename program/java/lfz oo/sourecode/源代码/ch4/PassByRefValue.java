//: PassByRefValue.java

//package g3ds.joop.ch4;

public class PassByRefValue{
	public static void main(String[] agrs){
		//���Ҽ���main->str1
		StringBuffer str1=new StringBuffer("abc");
		//���Ҽ���main->str2
		StringBuffer str2=new StringBuffer("123");
		
		PassByRefValue byRef=new PassByRefValue();
		
		//���main->str1��main->str2
		System.out.println("main->str1 before swap method: "+str1);
		System.out.println("main->str2 before swap method: "+str2);
		
		//swap��������ʵ�Σ���
		//main->str1����swap->str1����ʱmain->str1��swap->str1ָ��"abc"��
		//main->str2����swap->str2����ʱmain->str2��swap->str2ָ��"123"��
		//תswap��������...
		byRef.swap(str1, str2);
		
		//��û�а취Ӱ��ʵ�ε����ã�ʵ����ָ��ԭ���Ķ���
		//���main->str1��main->str2
		System.out.println("main->str1 after swap method: "+str1);
		System.out.println("main->str2 after swap method: "+str2);
	}
	
	//�������βε����ã���������ֻ�ڷ������У��޷�����
	//�βι��Ҽ���swap->str1��swap->str2
	void swap(StringBuffer str1, StringBuffer str2){
		//��swap->str1������ֵ����swap->temp
		//��ʱmain->str1��swap->str1��swap->tempָ��ͬһ����"abc"
		StringBuffer temp=str1;
		
		//��swap->str2������ֵ����swap->str1������Ӱ��main->str1
		//��ʱmain->str2��swap->str1��swap->str2ָ��ͬһ����"123"
		//��main->str1��swap->tempָ����һ����"abc"
		str1=str2;
		
		//��swap->temp������ֵ����swap->str2������Ӱ��main->str2
		//��ʱmain->str1��swap->temp��swap->str2ָ��ͬһ����"abc"
		//��ָ��main->str2��swap->str1��һ����"123"
		str2=temp;
		
		//���swap->str1��swap->str2
		System.out.println("swap->str1 in swap method: "+str1);
		System.out.println("swap->str2 in swap method: "+str2);
	}
}