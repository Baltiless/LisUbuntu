//: AboutReference.java

//package g3ds.joop.ch4;

public class AboutReference{
	public static void main(String[] agrs){
		//str��ʼ�齨"��ͥ"
		StringBuffer str=new StringBuffer("Contents");
		//strTest����
		StringBuffer strTest=str;
		//"��"�е����Ǵ�ҵ���
		strTest.append(" add Something.");
		
		//�������������"��"
		System.out.println("strTest�ļ�: "+strTest);
		System.out.println("str�ļ�: "+str);
		
		//****���ּ�ͥ�粨������****
		//"�ֵ�����"��
		strTest=null;
		System.out.println("�ֵ������strTest: "+strTest);
		
		//"��������"��
		StringBuffer strLure=new StringBuffer("Give you an apple, then leave him!");
		strTest=strLure;
		System.out.println("�������޵�strTest: "+strTest);
		
		//"�����Ż�"��
		strTest=new StringBuffer("It is my business!");
		System.out.println("�����Ż���strTest: "+strTest);
		
		//**** :<( ****
		
		System.out.println("�粨֮��str�ļң�"+str);
	}
}