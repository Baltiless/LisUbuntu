//: Callback.java

//package g3ds.joop.ch5;

//����һ���ӿڣ����г�ŵ��һ��run����
interface MyInterface{
	void run();
}

//����һ�������࣬���г�ŵ��һ��runAlso����
abstract class MyAbstract{
	public abstract void runAlso();
}

//�û�����ͨ���Լ��Ĵ��������Щ���󷽷������ܴ�ʱ����û��ʵ������ӿڻ������
class UserClass{
	//�ýӿ�������������
	void doSomething(MyInterface obj){
		obj.run();
	}
	
	//�ó�����������������
	void doAlso(MyAbstract obj){
		obj.runAlso();
	}
}

//�ṩһ���࣬�̳�MyAbstract�࣬ʵ��MyInterface�ӿ�
class MyClass extends MyAbstract implements MyInterface{
	void run(){
		System.out.println("����������");
	}
	
	public void runAlso(){
		System.out.println("��ϲ���ƣ�");
	}
}


public class Callback{
	public static void main(String[] args){
		MyClass myObj=new MyClass();
		UserClass userObj=new UserClass();
		
		//��һ��MyClass���󴫵ݸ�UserClass�������Ӧ����
		userObj.doSomething(myObj);
		userObj.doAlso(myObj);
	}
}