//:AppMain.java
//��һ��Դ�ļ��п��԰������main(String[] agrs)
//package g3ds.joop.ch2;

public class AppMain{ //an application 
	//������Ƕ��InnerMain��Ϊ�˶Ա��ã�����Ϊstatic
	static class InnerMain{
		public static void main(String[] agrs){
			System.out.println("Class InnerMain: Hello World!");
		}
	}

	public static void main(String[] agrs){ 
		System.out.println("Class AppMain: Hello World!"); 

		//���͵����ô���ʵ���ٵ��÷���
		//NonAppMain aNonAppMain=new NonAppMain();
		//aNonAppMain.main();

		//����static���ʵĵ��÷��������Բ��ش���ʵ��
		NonAppMain.main();
		InnerMain.main(agrs);
		OuterMain.main(agrs);

	} 
}

//�����ⲿ��OuterMain�����ж�����һģһ����main����
class OuterMain{
	public static void main(String[] agrs){ 
		System.out.println("Class OuterMain: Hello World!"); 
	}
}