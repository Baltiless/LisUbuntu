//: MethodArgument.java

//package g3ds.joop.ch4;

public class MethodArgument{
	public static void main(String[] args){
		int length=10;
		StringBuffer str=new StringBuffer("Contents");
		
		MethodArgument obj=new MethodArgument();
		System.out.println("��Ϊ��������֮ǰint�ͱ���length��ֵΪ��"+length);
		obj.passByValue(length);
		System.out.println("��Ϊ��������֮��int�ͱ���length��ֵΪ��"+length);
		
		System.out.println("��Ϊ��������֮ǰStringBuffer�ͱ���str��ֵΪ��"+str);
		obj.passByReference(str);
		System.out.println("��Ϊ��������֮��StringBuffer�ͱ���str��ֵΪ��"+str);
	}
	
	void passByValue(int length){
		length *=length;
		System.out.println("��������int�ͱ���length��ֵ�ı�Ϊ��"+length);
	}
	
	void passByReference(StringBuffer str){
		str.append(" Changed!");
		System.out.println("��������StringBuffer�ͱ���str��ֵ�ı�Ϊ��"+str);
	}
}