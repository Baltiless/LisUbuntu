//: ConstructorChain.java

//package g3ds.joop.ch4;

public class ConstructorChain{
	public static void main(String[] args){
		ThisClass obj=new ThisClass(80);
		System.out.println("ThisClassʵ��������aValue��ֵΪ��"+obj.aValue);
	}
}

class SuperSuperClass{
	//����ʵ������
	protected int aValue;
	
	SuperSuperClass(int aValue){
		//��ʽ���ø�����޲������췽��super()���ͱ�������ΪObject()
		System.out.println("ʵ������aValue��ȱʡ��ʼֵΪ��"+ this.aValue);
		this.aValue=aValue;
		System.out.println("SuperSuperClass���췽����ΪaValue��ֵ��"+ aValue);
	}
	
	/*
	  ���û�ж�����޲������췽����������չ��SuperClass���췽��
	  ���޷���ɹ��췽�������ã��������µĴ���
		cannot resolve symbol symbol  : constructor SuperSuperClass()
	*/
	SuperSuperClass(){
		//��ʽ���ñ�����������췽��
		this(10);
	}
}

class SuperClass extends SuperSuperClass{
	SuperClass(int aValue){
		//��ʽ���ø�����޲������췽��super()���ͱ�������ΪSuperSuperClass()
		System.out.println("�̳���SuperSuperClass���aValueֵ��"+ this.aValue);
		this.aValue=aValue;
		System.out.println("SuperClass���췽����ΪaValue��ֵ��"+ this.aValue);
	}
	
	/*
	  ��Ϊ�Ѿ������˴������Ĺ��췽��������ԭ��ȱʡ���޲������췽��SuperClass()
	  ���Զ�ʧЧ�����Ҫʹ������������ʽ���塣
	  ��Ȼ�ӱ�����������췽����û���õģ��������������ƹ��û�ʹ�õ��࣬��ô
	  ȱ��������췽������Σ�յģ���Ϊ���û���չ������ʱ�п��ܾ���ʽ�������޲�
	  �����췽������������������Ҫ�Ĵ��󣬳������������һ��final�ࡣ��Ϊһ��
	  �õ�ϰ�ߣ������ʽ�����޲����Ĺ��췽����
	*/
	SuperClass(){
		//��ʽ���ñ�����������췽��
		this(50);
	}
}

final class ThisClass extends SuperClass{
	ThisClass(int aValue){
		//��ʽ���ø���������Ĺ��췽��
		super(aValue);
	}
	
	//fianl�಻���ٱ���չ���������޲������췽��Ҳ��������鷳��
	//��������û���õĻ���
	//ThisClass(){}
}