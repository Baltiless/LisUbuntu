//: InnerClass.java
/*: �ܹ�����12����,�ֱ���
	1���ӿڣ� AnonymousInner.class
	2���ⲿ�ࣺ InnerClass.class��UsingInnerClass.class
	1����̬��Ա�ࣺ InnerClass$StaticInner.class
	1��ʵ����Ա�ࣺ InnerClass$InstanceInner.class
	5���ֲ���Ա�ࣺ InnerClass$1$NestInner.class��InnerClass$1$MultiNest.class��
		InnerClass$1$NestInner$MultiNest.class�� InnerClass$1$ScopeInner.class
		InnerClass$2$MultiNest.class
	2�������ࣺInnerClass$1.class��InnerClass$2.class
*/

//package g3ds.joop.ch4;

//���౻����� InnerClass.class
public class InnerClass{
	
	/*
	//���԰��ڲ�������Ϊ�ⲿ��ľ�̬��Ǿ�̬��Ա����
	static StaticInner si=new StaticInner();
	//����ʵ����Ա�಻��ֱ������Ϊstatic
	//static InstanceInner ii1=new InstanceInner();//It is wrong
	InstanceInner ii1=new InstanceInner();//It is ok
	//���ȴ����ⲿ��ʵ�����������Ϊstatic
	static InstanceInner ii2=new InnerClass().new InstanceInner();
	*/
	
	//�ⲿ���ʵ������
	int varTest=0;
	
	//��̬��Ա�ࣺ���౻����� InnerClass$StaticInner.class
	static class StaticInner{
		StaticInner(){
			System.out.println("Show me: StaticInner");

		}
	}
	
	//ʵ����Ա�ࣺ���౻����� InnerClass$InstanceInner.class
	class InstanceInner{
		//����һ�����ⲿ���ʵ������ͬ�����ڲ������
		int varTest=5;
		
		void doSomething(){
			//�ڷ����н�һ������ͬ���ľֲ�����
			int varTest=10;
			
			System.out.println("Show me: InstanceInner");
			
			System.out.println("ͬ�������ķ��ʷ�������:");
			
			//varTest:�ֲ�����
			System.out.println("varTest in InstanceInner(): " + varTest);
			
			//this.varTest:ͬ�����ڲ������
			System.out.println("varTest in Inner class: " + this.varTest);
			
			//InnerClass.this.varTest:ͬ�����ⲿ��ı���
			System.out.println("varTest in outer class: " + InnerClass.this.varTest);
		}
	}
	
	//����һ�������ֲ���Ա���ʵ�����������Ѿֲ���Ա�������ֵ����
	public Object nestTest(){
		//�ھֲ���Ա����ʹ�õľֲ�������������Ϊfinal��
		final int VARTEST=100;
		
		//�ڲ�������ж����ļ̳й�ϵ��ʵ���Լ��Ľӿ�,
		//���౻����� InnerClass$1$NestInner.class
		class NestInner extends InstanceInner implements AnonymousInner{
			NestInner(){
				//���౻����� InnerClass$1$MultiNest.class
				class MultiNest{}
				
				System.out.println("Show me: NestInner");
				
				//VARTEST: ����Ϊfinal�͵ľֲ�����
				System.out.println("calling varible beyond the scope: " + VARTEST);
			}
			
			//���౻����� InnerClass$1$NestInner$MultiNest.class
			class MultiNest{}
		}
		
		//����һ���ֲ���Ա�����
		return new NestInner();
	}
	
	public void scopeTest(boolean condition){
		if(condition){
			//��һ������ж���һ���ֲ���Ա��,���౻����� InnerClass$1$ScopeInner.class
			class ScopeInner{
				ScopeInner(){
					//���౻����� InnerClass$2$MultiNest.class
					class MultiNest{}
					System.out.println("Show me: ScopeInner");
				}
			}
			new ScopeInner();
		}
	}
	
	public void anonymousTest(){
		//�˴�����һ�������࣬���ܱ������InnerClass$1.class
		new AnonymousInner(){
			//��Ϊʵ�������
			{
				//�������л����Զ��������࣬"="�ұ߿��ܱ������InnerClass$2.class
				Object obj=new AnonymousInner(){};
				
				System.out.println("Show me: AnonymousInner");
			}		
		//��β���ġ�;�������٣�
		};
	}

	public static void main(String[] args){
		System.out.println("������ʽ���ڲ�����ԣ�");
		
		//������Ӧ���ⲿ��ʵ������
		InnerClass innerClass=new InnerClass();
		
		//��̬��Ա�����ֱ��ʵ����
		StaticInner staticInner=new StaticInner();
		
		//�Ǿ�̬��Ա�����������ⲿ��ʵ��
		InstanceInner instanceInner=innerClass.new InstanceInner();
			instanceInner.doSomething();
		innerClass.nestTest();
		innerClass.scopeTest(true);
		innerClass.anonymousTest();
	}
}

//ģ���¼�������������һ���ӿ�
//�˽ӿڱ������ AnonymousInner.class
interface AnonymousInner{}

//ʹ�������ⲿ����ڲ���ķ�ʽ,���౻����� UsingInnerClass.class
class UsingInnerClass{
	public static void main(String[] args){
		//����ֱ���Ա������������ʵ����������һ��������ʽ�Ǵ���� ��
		//InnerClass$StaticInner icsi=new InnerClass$StaticInner();
		
		//��̬��Ա�����ֱ��ʵ����
		InnerClass.StaticInner icsi=new InnerClass.StaticInner();
		
		//�Ǿ�̬��Ա�����������ⲿ��ʵ��
		InnerClass.InstanceInner icii=new InnerClass().new InstanceInner();
		icii.doSomething();
	}
}