//: Rectangle.java

//package g3ds.joop.ch5;

public class Rectangle{
	//���εĳ��Ϳ�
	private double width;
	private double height;
	
	public Rectangle(double w, double h){
		width=w;
		height=h;
	}
	
	//������ε����	
	public double area(){
		return width*height;
	}
	
	//���þ��α߳�ֵ
	public void setWidth(double w){
		width=w;
	}
	
	public void setHeight(double h){
		height=h;
	}
		
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
}