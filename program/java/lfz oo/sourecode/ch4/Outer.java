//:Outer.java

//package g3ds.joop.ch4;

public class Outer{
	/*��������ΪOuter����ڲ���
	private class InstanceInner{
		//�Ǿ�̬��Ա�಻�ɰ�����̬����
		static int k;
	}
	*/
	
	protected static class StaticInner{
		static int k;
	}
	
	/*��������ΪOuter����ڲ���
	public class AnotherInstanceInner{
		//�Ǿ�̬��Ա�಻�ɰ�����̬����
		static int k;
	}
	*/
	
	public abstract class AbstractInner{
		public abstract void method();
	}
	
	public interface InterfaceInner{
		void method();
	}
}