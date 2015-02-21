//: RTTIDemo.java

//package g3ds.joop.ch5;

public class RTTIDemo{
  public static void main(String args[]) {
    X x = new X();
    Y y = new Y();
    Class clObj;

	//���y�����Class��������
    clObj = y.getClass(); 
    System.out.println("y is object of type: "+clObj.getName());
    
    //���y�������Class��������
    clObj = clObj.getSuperclass();
    System.out.println("y's superclass is "+ clObj.getName());
    
    //���x�����Class��������
    clObj = x.getClass();
    System.out.println("x is object of type: "+clObj.getName());
	
	//���x�������Class��������
    clObj = clObj.getSuperclass();
    System.out.println("x's superclass is "+ clObj.getName());
    
    //����Object��ĳ���
    System.out.println("Object's superclass is "+ clObj.getSuperclass());
  }
}

class X {}

class Y extends X {}