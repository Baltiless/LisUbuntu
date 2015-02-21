//: ObjectClone.java

//package g3ds.joop.ch4;

public class ObjectClone{
	public static void main(String[] args){
		MyObject obj=new MyObject("Original MyObject!");
		
		System.out.println("��������ǰԭ����������ԣ�"+obj.name);
		
		new ObjectClone().passByReference(obj);
		
		System.out.println("�������ú�ԭ����������ԣ�"+obj.name);
	}
	
	void passByReference(MyObject obj){
		MyObject o=(MyObject)obj.clone();
		o.name="MyObject Clone!";
		System.out.println("�������иı��˸��ƶ�������ԣ�"+o.name);
	}
}

class MyObject implements Cloneable{
	String name;
	
	MyObject(String name){
		this.name=name;
	}
	
	//��дclone����
	public Object clone(){
		Object obj=null;
		
		try{
			obj=super.clone();
		}
		catch(CloneNotSupportedException e){
			System.err.println(e);
		}
		
		return obj;
	}
}