//: Polygon.java

//package g3ds.joop.ch5;

public class Polygon {
	//����һ����ɶ���νڵ���������
	private Point[] points;
	
	//ȡ�ýڵ���Ϣ
	public Point[] getPoints() { 
		return points;
	}
	
	public Polygon(Point[] points) throws Exception {
		if (points.length < 3) 
			throw new Exception("�ڵ���Ӧ������3��!");
		this.points = points; 
	}
}