//: Circle.java

//package g3ds.joop.ch5;

public class Circle {
	//Բ�뾶
	private double radius;

	//��¼Բ�����꣬��������Ǳ����һ����
	private Point center;
	
	//ȡ��Բ���������Ϣ
	public Point getCenter() { 
		return center;
	}
	
	public Circle(double radius, Point center) throws Exception {
		if (radius < 0.0) 
    		throw new Exception("�뾶ֵӦ����0!");
		this.radius = radius; 
		this.center = center; 
	}

	public double getRadius() { 
		return radius;
	}
}