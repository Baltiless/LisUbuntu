//: ANonStatic.java

//package g3ds.joop.ch4;

public class ANonStatic{ 
	//����ʵ������
	String a;
	
	//����ʵ������
	void sayHi_A() {
		System.out.println("ANonStatic.sayHi(): ANonStatic's vars are: {" +
			 this.a + ',' + this.b + '}');
	}
	
	//���幹�췽��
	public ANonStatic(String aStr, String bStr){
		//������ʽ��ֵǰʵ������a��b��ֵ
		System.out.println("ANonStatic(String aStr, String bStr) at Top: {" + 
			this.a + ',' + this.b + '}');
		
		//Ϊʵ������a��b��ʽ��ֵ
		a=aStr; 
		b=bStr;
		
		//������ʽ��ֵ��ʵ������a��b��ֵ
		System.out.println("ANonStatic(String aStr, String bStr) at Bottom: {" + 
			this.a + ',' + this.b + '}');
	} 
	
	//��������ʼ��ʵ������
	String b=new BB().sayHi_BB();
	
	//����ʵ������飬ִ��ʱ�൱�ڰ����е���䰴���������еĹ��췽������
	{
		System.out.println("ANonStatic.static: ANonStatic's vars are: {" + 
			this.a + ',' + this.b + '}' );
	}
	
	//�����޲ι��췽������Ȼ����û����ʽ��д��䣬
	//ʵ����ʵ��������е����Ҳ������ִ��
   	public ANonStatic(){}	
   	
   	public static void main(String[] args) {
   		//����ANonStatic()�е����
   		new ANonStatic();
   		//����ANonStatic(String aStr, String bStr)�е����
   		new ANonStatic("aaa", "bbb");
		System.out.println("Then execute the clause in ANonStatic's main method.");
	} 
}

class BB {
	//���徲̬�����
	static
	{ 
		ANonStatic instanceA=new ANonStatic();
		System.out.println("BB.nonStatic #1: nonStatic's vars are: {" + 
			instanceA.a + ',' + instanceA.b + '}');
		instanceA.sayHi_A();
		System.out.println("BB.nonStatic #2: ANonStatic's vars are: {" + 
			instanceA.a + ',' + instanceA.b + '}');
	}
	
	//����ʵ������
	String sayHi_BB() {
		System.out.println("In sayHi_BB()");
		return "Hi";
	}
	
	public static void main(String[] args) {} 
}