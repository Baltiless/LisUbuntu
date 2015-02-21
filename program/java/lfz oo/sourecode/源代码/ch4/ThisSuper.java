//: ThisSuper.java

//package g3ds.joop.ch4;

public class ThisSuper{
	public static void main(String[] args){
		ThisExample obj=new ThisExample(10);
		System.out.println(obj.toString()+ ": obj.aValue="+obj.aValue);
		//������������ת����ø����ͬ��������((SuperExample)obj).aValue
		//�����ǲ���������ʽ��obj.super.aValue
		System.out.println("((SuperExample)obj).aValue="+((SuperExample)obj).aValue);
	}
}

class SuperExample{
	int aValue;
	public SuperExample(){
		aValue=10;
	}
}

class ThisExample extends SuperExample{
	int aValue;
	public ThisExample(int otherValue){
		//����super��ʽ���ø��๹�췽��SuperExample()
		//��ʵ������ȱʡ��䣬��дҲ����
		//�������ֻ���ڹ��췽����ʹ��
		super();
		//����super���ø������
		aValue=super.aValue*otherValue; 
	}
	
	public ThisExample(){
		//����this��ʽ���ù��췽�� ThisExample(int aValue)
		//�������ֻ���ڹ��췽����ʹ��
		this(0);
	}
	
	public void setValue(int aValue){
		//����this������ֲ�����ͬ����ʵ������
		this.aValue=aValue;
	}
}