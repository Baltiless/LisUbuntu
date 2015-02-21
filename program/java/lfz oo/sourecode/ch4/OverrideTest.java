//: OverrideTest.java

//package g3ds.joop.ch4;

public class OverrideTest{
	public static void main(String[] args){
		//���ԣ���ǰ�ཫ�����Լ����ж����ͬ������
		//new Oval().draw();
		//new Rectangle().draw();
		
		//���ԣ���������Ϊ������������ʵ�ֶ���չ�����Ĺ���
		Shape[] shapes=new Shape[5];
		for(int i=0; i<shapes.length; i++){
			//��������Ԫ��
			shapes[i]=createShape((int)(Math.random()*5));
			//������Ӧ�Ļ��Ʒ���
			shapes[i].draw();
		}
		
	}
	
	//���ڲ��ԵĴ�������Ԫ�ط���
	static Shape createShape(int seed){
		Shape shape=null;
		switch(seed){
			case 0:
				System.out.print("������Բ...");
				shape=new Oval();
				break;
			case 1:
				System.out.print("�����ı���...");
				shape=new Quadrangle();
				break;
			case 2:
				System.out.print("����������...");
				shape=new Triangle();
				break;
			case 3:
				System.out.print("����������...");
				shape=new Square();
				break;
			case 4:
				System.out.print("����������...");
				shape=new Rectangle();
				break;
		}
		
		return shape;
	}
}

//����һ���������ʾ������״
abstract class Shape{
	//����һ�����Ƽ�����״�ĳ��󷽷�
	public abstract void draw();
}

//������Բ��ΪShape������
class Oval extends Shape{
	//���ö�̬�Ի��ƣ����¶��巽����ʵ��
	public void draw(){
		System.out.println("������Բ");
	}
}

//�����ı�����ΪShape������
class Quadrangle extends Shape{
	//���ö�̬�Ի��ƣ����¶��巽����ʵ��
	public void draw(){
		System.out.println("�����ı���");
	}
}

//������������ΪShape������
class Triangle extends Shape{
	//���ö�̬�Ի��ƣ����¶��巽����ʵ��
	public void draw(){
		System.out.println("����������");
	}
}

//������������ΪQuadrangle������
class Square extends Quadrangle{
	//���ö�̬�Ի��ƣ����¶��巽����ʵ��
	public void draw(){
		System.out.println("����������");
	}
}

//���峤������ΪQuadrangle������
class Rectangle extends Quadrangle{
	//���ö�̬�Ի��ƣ����¶��巽����ʵ��
	public void draw(){
		System.out.println("���Ƴ�����");
	}
}